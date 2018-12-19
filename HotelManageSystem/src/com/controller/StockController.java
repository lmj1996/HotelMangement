package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.VO.StockVO;
import com.google.gson.Gson;
import com.pojo.*;
import com.service.StockService;

@Controller

@RequestMapping("/stock")
@SessionAttributes("sc")
public class StockController {
	
	@Resource(name = "stockService")
	private StockService stockService;
	
	/**
	 * 添加库存信息
	 * @return
	 */
	@RequestMapping(value = "/addStock")
	public ModelAndView addStock(Stock stock) {
		ModelAndView modelAndView = new ModelAndView();
		String add = stockService.addStock(stock);
		if (add.equals("success")) {
			modelAndView.addObject("state", "addStock");
			modelAndView.setViewName("stock/stock_list");
			return modelAndView;
		} else {
			return null;
		}
	}
	
	/**
	 * 更新库存信息
	 * @return
	 */
	@RequestMapping(value = "/updateStock")
	public ModelAndView updateStock(Stock stock) {
		ModelAndView modelAndView = new ModelAndView();
		String add = stockService.updateStock(stock);
		if (add.equals("success")) {
			modelAndView.addObject("state", "updateStock");
			modelAndView.setViewName("stock/stock_list");
			return modelAndView;
		} else {
			return null;
		}
	}
	
	/**
	 * 根据ID获得库存信息
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value = "/getStockInfo")
	public void getStockInfo(String stockId,HttpServletRequest request, HttpServletResponse response) throws IOException {
		Stock stock = stockService.getStockInfo(stockId);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(stock));
	}
	
	/**
	 * 获得库存类型
	 * @throws IOException 
	 */
	@RequestMapping(value = "/getStockType")
	public void getStockType(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<StockType> list = new ArrayList<>();
		list = stockService.getStockType();
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(list));
	}
	
	/**
	 * 获得库存列表
	 * @throws IOException 
	 */
	@RequestMapping(value = "/getStockList")
	public void getStockList(HttpServletRequest request, HttpServletResponse response,StockVO stockVO,int page) throws IOException {
		stockVO.setPageIndex(page);
		StockVO getStockVO = stockService.getStockList(stockVO);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(getStockVO));
	}
	
	/**
	 * 删除库存
	 */
	@RequestMapping(value = "/deleteStock")
	public ModelAndView deleteStock(String stockId) {
		ModelAndView modelAndView = new ModelAndView();
		stockService.deleteStock(stockId);
		modelAndView.addObject("state","delete");
		modelAndView.setViewName("stock/stock_list");
		return modelAndView;
	}
	
	/**
	 * 获得可消费物品列表
	 * @throws IOException 
	 */
	@RequestMapping(value = "/getCost")
	public void getCost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Stock> list = stockService.getCost();
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(list));
	}
	
	/**
	 * 增加消费操作
	 */
	@RequestMapping(value = "/addCost")
	public ModelAndView addCost(String roomId,String stockId) {
		stockService.addCost(roomId,stockId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("state","success");
		modelAndView.addObject("roomId", roomId);
		modelAndView.setViewName("user/add_cost");
		return modelAndView;
	}
	
}
