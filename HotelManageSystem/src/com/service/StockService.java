package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.DTO.StockDTO;
import com.VO.StockVO;
import com.mapper.*;
import com.pojo.AddConsumption;
import com.pojo.HotelRegister;
import com.pojo.HotelRegisterExample;
import com.pojo.Stock;
import com.pojo.StockExample;
import com.pojo.StockExample.Criteria;
import com.pojo.StockType;
import com.util.BuildUuid;
import com.util.TimeUtil;

@Service("stockService")
public class StockService {
	@Resource
	private StockMapper stockMapper;

	@Resource
	private StockTypeMapper stockTypeMapper;
	
	@Resource
	private HotelRegisterMapper hotelRegisterMapper;
	
	@Resource
	private AddConsumptionMapper addConsumptionMapper;

	// 添加库存
	public String addStock(Stock stock) {
		String x = "SP-";

		List<Stock> listStock = stockMapper.selectByExample(null);
		if (listStock != null) {
			String maxNumber = stockMapper.getMaxNumber();
			if (maxNumber != null && maxNumber.trim().length() > 0) {
				int nextNumber = Integer.parseInt(maxNumber);
				nextNumber = nextNumber + 1;
				String num = String.format("%03d", nextNumber);
				stock.setStockNum(x + num);
			} else {
				stock.setStockNum(x + "001");
			}
		} else {
			stock.setStockNum(x + "001");
		}

		stock.setStockId(BuildUuid.getUuid());
		stockMapper.insertSelective(stock);
		return "success";
	}

	// 更新库存
	public String updateStock(Stock stock) {
		stockMapper.updateByPrimaryKeySelective(stock);
		return "success";
	}

	// 根据ID获得库存信息
	public Stock getStockInfo(String stockId) {
		Stock stock = stockMapper.selectByPrimaryKey(stockId);
		return stock;
	}

	// 获得库存类型
	public List<StockType> getStockType() {
		List<StockType> list = stockTypeMapper.selectByExample(null);
		return list;
	}

	// 获得库存列表
	public StockVO getStockList(StockVO stockVO) {
		List<StockDTO> listStockDTO = new ArrayList<>();
		StockDTO stockDTO;
		List<Stock> listStock = new ArrayList<>();

		StockExample stockExample = new StockExample();
		stockExample.setOrderByClause("stock_num");
		stockExample.setStartRow((stockVO.getPageIndex() - 1) * stockVO.getPageSize());
		stockExample.setPageSize(stockVO.getPageSize());
		Criteria criteria = stockExample.createCriteria();
		Criteria criteria2 = stockExample.createCriteria();
		if (stockVO.getSearch() != null && stockVO.getSearch().trim().length() > 0) {
			criteria.andStockNameLike("%" + stockVO.getSearch() + "%");
			criteria2.andStockNumLike("%" + stockVO.getSearch() + "%");
			stockExample.or(criteria2);
		}
		if (stockVO.getType() != null && stockVO.getType().trim().length() > 0) {
			criteria.andStockTypeEqualTo(stockVO.getType());
		}

		int count = stockMapper.countByExample(stockExample);
		/**
		 * 设置总数量
		 */
		stockVO.setTotalRecords(count);
		/**
		 * 设置总页数
		 */
		stockVO.setTotalPages(((count - 1) / stockVO.getPageSize()) + 1);
		/**
		 * 判断是否拥有上一页
		 */
		if (stockVO.getPageIndex() <= 1) {
			stockVO.setHavePrePage(false);
		} else {
			stockVO.setHavePrePage(true);
		}
		/**
		 * 判断是否拥有下一页
		 */
		if (stockVO.getPageIndex() >= stockVO.getTotalPages()) {
			stockVO.setHaveNextPage(false);
		} else {
			stockVO.setHaveNextPage(true);
		}
		listStock = stockMapper.selectByExampleForPaging(stockExample);
		if (listStock != null) {
			for (Stock stock : listStock) {
				stockDTO = new StockDTO();
				StockType s = stockTypeMapper.selectByPrimaryKey(stock.getStockType());

				if (stockVO.getSearch() != null && stockVO.getSearch().trim().length() > 0) {
					stock.setStockName(stock.getStockName().replaceAll(stockVO.getSearch(),
							"<span style='color: #ff5063;'>" + stockVO.getSearch() + "</span>"));
					stock.setStockNum(stock.getStockNum().replaceAll(stockVO.getSearch(),
							"<span style='color: #ff5063;'>" + stockVO.getSearch() + "</span>"));
				}

				stockDTO.setStock(stock);
				stockDTO.setStockType(s);
				listStockDTO.add(stockDTO);
			}
		}
		stockVO.setListStockDTO(listStockDTO);

		return stockVO;
	}

	// 删除库存
	public void deleteStock(String stockId) {
		stockMapper.deleteByPrimaryKey(stockId);
	}

	// 获得可消费物品
	public List<Stock> getCost() {
		StockExample stockExample = new StockExample();
		stockExample.setOrderByClause("stock_num");
		Criteria criteria = stockExample.createCriteria();
		Criteria criteria2 = stockExample.createCriteria();
		Criteria criteria3 = stockExample.createCriteria();
		Criteria criteria4 = stockExample.createCriteria();
		criteria.andStockTypeEqualTo("s001");
		criteria2.andStockTypeEqualTo("s002");
		criteria3.andStockTypeEqualTo("s003");
		criteria4.andStockTypeEqualTo("s006");
		stockExample.or(criteria2);
		stockExample.or(criteria3);
		stockExample.or(criteria4);
		List<Stock> list = stockMapper.selectByExample(stockExample);
		
		return list;
	}

	// 添加消费
	public void addCost(String roomId, String stockId) {
		HotelRegister hotelRegister = hotelRegisterMapper.selectByRoomId(roomId);
		
		Stock stock = stockMapper.selectByPrimaryKey(stockId);
		int number = Integer.parseInt(stock.getStockNumber());
		number = number - 1 ;
		stock.setStockNumber(number+"");
		stockMapper.updateByPrimaryKeySelective(stock);
		
		AddConsumption addConsumption = new AddConsumption();
		addConsumption.setAddConsumptionId(BuildUuid.getUuid());
		addConsumption.setAddConsumptionName(stock.getStockName());
		addConsumption.setAddConsumptionPrice(stock.getStockRetailprice());
		addConsumption.setAddConsumptionRoom(roomId);
		addConsumption.setAddConsumptionCustomer(hotelRegister.getHotelRegisterCustomer());
		addConsumption.setAddConsumptionTime(TimeUtil.getStringSecond());
		addConsumptionMapper.insertSelective(addConsumption);
		
	}

}
