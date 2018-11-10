package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.DTO.*;
import com.VO.*;
import com.mapper.*;
import com.pojo.*;
import com.pojo.RoomExample.Criteria;
import com.util.*;

@Service("hotelService")
public class HotelService {
	@Resource
	private RoomMapper roomMapper;

	@Resource
	private HotelRegisterMapper hotelRegisterMapper;

	@Resource
	private CustomerMapper customerMapper;

	@Resource
	private RechargeMapper rechargeMapper;

	@Resource
	private ChargingWayMapper chargingWayMapper;

	// 添加房间
	public String addRoom(Room room) {
		String x = "LT-";
		if (room.getRoomFloor().trim().length() == 1) {
			List<Room> room_1 = new ArrayList<>();
			room_1 = roomMapper.getRoomByFloor(room.getRoomFloor());
			if (room_1 != null) {
				String maxNumber = roomMapper.getMaxNumber(room.getRoomFloor());
				if (maxNumber != null && maxNumber.trim().length() > 0) {
					int nextNumber = Integer.parseInt(maxNumber);
					nextNumber = nextNumber + 1;
					String num = String.format("%03d", nextNumber);
					room.setRoomNum(x + room.getRoomFloor() + "-" + num);
				} else {
					room.setRoomNum(x + room.getRoomFloor() + "-" + "001");
				}

			} else {
				room.setRoomNum(x + room.getRoomFloor() + "-" + "001");
			}
			room.setRoomId(BuildUuid.getUuid());
			room.setRoomState("空闲");
			room.setRoomCreatetime(TimeUtil.getStringSecond());
			room.setRoomModifytime(TimeUtil.getStringSecond());
			roomMapper.insertSelective(room);
			System.out.println("添加成功");
			return "success";

		} else if (room.getRoomFloor().trim().length() == 2) {
			List<Room> room_2 = new ArrayList<>();
			room_2 = roomMapper.getRoomByFloor(room.getRoomFloor());
			System.out.println("room:" + room_2);
			if (room_2 != null) {
				String maxNumber2 = roomMapper.getTwoMaxNumber(room.getRoomFloor());
				if (maxNumber2 != null && maxNumber2.trim().length() > 0) {
					int nextNumber2 = Integer.parseInt(maxNumber2);
					nextNumber2 = nextNumber2 + 1;
					String num2 = String.format("%03d", nextNumber2);
					room.setRoomNum(x + room.getRoomFloor() + "-" + num2);
				} else {
					room.setRoomNum(x + room.getRoomFloor() + "-" + "001");
				}

			} else {
				room.setRoomNum(x + room.getRoomFloor() + "-" + "001");
			}
			room.setRoomId(BuildUuid.getUuid());
			room.setRoomState("空闲");
			room.setRoomCreatetime(TimeUtil.getStringSecond());
			room.setRoomModifytime(TimeUtil.getStringSecond());
			roomMapper.insertSelective(room);
			System.out.println("添加成功");
			return "success";
		} else {
			return "error";
		}
	}

	// 房间分页功能
	public RoomVO queryAllRoom(RoomVO roomVO) {
		List<RoomDTO> listRoomDTO = new ArrayList<>();
		RoomDTO roomDTO;
		List<Room> listRoom = new ArrayList<>();

		RoomExample roomExample = new RoomExample();
		roomExample.setOrderByClause("room_modifytime desc");
		roomExample.setStartRow((roomVO.getPageIndex() - 1) * roomVO.getPageSize());
		roomExample.setPageSize(roomVO.getPageSize());
		Criteria roomCriteria = roomExample.createCriteria();
		roomCriteria.andRoomIdIsNotNull();
		if (roomVO.getFloor() != null && roomVO.getFloor().trim().length() > 0) {
			roomCriteria.andRoomFloorEqualTo(roomVO.getFloor());
		}
		if (roomVO.getState() != null && roomVO.getState().trim().length() > 0) {
			roomCriteria.andRoomStateEqualTo(roomVO.getState());
		}
		if (roomVO.getType() != null && roomVO.getType().trim().length() > 0) {
			roomCriteria.andRoomTypeEqualTo(roomVO.getType());
		}
		if (roomVO.getSearch() != null && roomVO.getSearch().trim().length() > 0) {
			roomCriteria.andRoomNumLike("%" + roomVO.getSearch() + "%");
		}

		int count = roomMapper.countByExample(roomExample);
		/**
		 * 设置总数量
		 */
		roomVO.setTotalRecords(count);
		/**
		 * 设置总页数
		 */
		roomVO.setTotalPages(((count - 1) / roomVO.getPageSize()) + 1);
		/**
		 * 判断是否拥有上一页
		 */
		if (roomVO.getPageIndex() <= 1) {
			roomVO.setHavePrePage(false);
		} else {
			roomVO.setHavePrePage(true);
		}
		/**
		 * 判断是否拥有下一页
		 */
		if (roomVO.getPageIndex() >= roomVO.getTotalPages()) {
			roomVO.setHaveNextPage(false);
		} else {
			roomVO.setHaveNextPage(true);
		}

		listRoom = roomMapper.selectByExampleForPaging(roomExample);
		if (listRoom != null && listRoom.size() > 0) {
			for (Room room : listRoom) {
				roomDTO = new RoomDTO();
				if (room != null) {
					roomDTO.setRoom(room);
				}
				if (roomVO.getSearch() != null && roomVO.getSearch().trim().length() > 0) {
					room.setRoomNum(room.getRoomNum().replaceAll(roomVO.getSearch(),
							"<span style='color: #ff5063;'>" + roomVO.getSearch() + "</span>"));
				}
				listRoomDTO.add(roomDTO);

			}
			roomVO.setListRoomDTO(listRoomDTO);
			return roomVO;
		}

		return null;

	}

	// 更新房间信息
	public String updateRoom(Room room) {
		room.setRoomState("空闲");
		roomMapper.updateByPrimaryKeySelective(room);
		return "success";
	}

	// 顾客住宿登记
	public String customerStayOverNight(Room room, Customer customer, HotelRegister hotelRegister, Recharge recharge) {
		if (customer.getCustomerCustomerid() != null && customer.getCustomerCustomerid().trim().length() > 0) {
			Customer checkCustomer = customerMapper.selectCustomerByIDnum(customer.getCustomerCustomerid());
			if (checkCustomer != null) {
				recharge.setRechargeCustomer(checkCustomer.getCustomerId());
				hotelRegister.setHotelRegisterCustomer(checkCustomer.getCustomerId());
			} else {
				customer.setCustomerId(BuildUuid.getUuid());
				customer.setCustomerBalance(recharge.getRechargeMoney());
				customer.setCustomerType("游客");
				customerMapper.insertSelective(customer);
				recharge.setRechargeCustomer(customer.getCustomerId());
				hotelRegister.setHotelRegisterCustomer(customer.getCustomerId());
			}
			recharge.setRechargeId(BuildUuid.getUuid());
			recharge.setRechargeTime(TimeUtil.getStringSecond());
			rechargeMapper.insertSelective(recharge);

			hotelRegister.setHotelRegisterId(BuildUuid.getUuid());
			hotelRegister.setHotelRegisterRoom(room.getRoomId());
			hotelRegister.setHotelRegisterStarttime(TimeUtil.getStringSecond());
			hotelRegister.setHotelRegisterCreatetime(TimeUtil.getStringSecond());
			hotelRegister.setHotelRegisterModifytime(TimeUtil.getStringSecond());
			hotelRegisterMapper.insertSelective(hotelRegister);

			room.setRoomState("已租出");
			room.setRoomModifytime(TimeUtil.getStringSecond());
			roomMapper.updateByPrimaryKeySelective(room);

			return "success";
		}

		return "error";

	}

	// 添加计费规则
	public String addChargingWay(ChargingWay chargingWay) {
		chargingWay.setChargingWayId(BuildUuid.getUuid());
		chargingWay.setChargingWayCreatetime(TimeUtil.getStringSecond());
		chargingWay.setChargingWayModifytime(TimeUtil.getStringSecond());
		chargingWayMapper.insertSelective(chargingWay);
		return "success";

	}

	// 查询计费规则
	public List<ChargingWay> queryChargingWay() {
		ChargingWayExample chargingWayExample = new ChargingWayExample();
		com.pojo.ChargingWayExample.Criteria criteria = chargingWayExample.createCriteria();
		criteria.andChargingWayIdIsNotNull();
		List<ChargingWay> list = chargingWayMapper.selectByExample(chargingWayExample);
		return list;
	}

	// 修改计费规则
	public String updateChargingWay(ChargingWay chargingWay) {
		chargingWay.setChargingWayModifytime(TimeUtil.getStringSecond());
		chargingWayMapper.updateByPrimaryKeySelective(chargingWay);
		return "success";
	}

	// 删除计费规则
	public String deleteChargingWay(ChargingWay chargingWay) {
		chargingWayMapper.deleteByPrimaryKey(chargingWay.getChargingWayId());
		return "success";
	}

	// 获得结账信息
	public CheckOutDTO getCheckOutInfo(String roomId) {
		CheckOutDTO checkOutDTO = new CheckOutDTO();
		Room room = roomMapper.selectByPrimaryKey(roomId);
		HotelRegister hotelRegister = hotelRegisterMapper.selectByRoomId(roomId);
		Customer customer = customerMapper.selectByPrimaryKey(hotelRegister.getHotelRegisterCustomer());
		String currentTime = TimeUtil.getStringSecond();
		// 总消费
		String totalPrice;
		// 余额
		String settleMoney;
		long count = TimeCount.getDay(hotelRegister.getHotelRegisterStarttime(), currentTime);
		System.out.println("天数：" + count);
		long base = Long.parseLong(room.getRoomPrice());
		System.out.println("价格：" + base);
		// 根据居住时间计算费用
		int a = (int) count;
		if (a == 0) {
			a = a + 1;
		}
		int b = (int) base;
		int total = a * b;
		long balance = Long.parseLong(customer.getCustomerBalance());
		int security = Integer.parseInt(hotelRegister.getHotelRegisterSecurity());
		balance = balance - total + security;
		if (hotelRegister.getHotelRegisterTotalprice() != null
				&& hotelRegister.getHotelRegisterTotalprice().trim().length() > 0) {
			long other = Long.parseLong(hotelRegister.getHotelRegisterTotalprice());
			int c = (int) other;
			total = total + c;
		}
		totalPrice = total + "";
		settleMoney = balance + "";
		System.out.println("计算结果：" + totalPrice);
		System.out.println("余额：" + settleMoney);
		hotelRegister.setHotelRegisterTotalprice(totalPrice);
		checkOutDTO.setCustomer(customer);
		checkOutDTO.setHotelRegister(hotelRegister);
		checkOutDTO.setSettleMoney(settleMoney);

		return checkOutDTO;
	}

	// 结账操作
	public void checkOut(Room room, Customer customer, HotelRegister hotelRegister) {
		Room room1 = roomMapper.selectByPrimaryKey(room.getRoomId());
		room1.setRoomState("清扫中");
		room1.setRoomModifytime(TimeUtil.getStringSecond());
		roomMapper.updateByPrimaryKeySelective(room1);

		Customer customer1 = customerMapper.selectCustomerByIDnum(customer.getCustomerCustomerid());
		customer1.setCustomerBalance("0");
		customerMapper.updateByPrimaryKeySelective(customer1);

		HotelRegister hotelRegister1 = hotelRegisterMapper.selectByRoomId(room.getRoomId());
		hotelRegister1.setHotelRegisterTotalprice(hotelRegister.getHotelRegisterTotalprice());
		hotelRegister1.setHotelRegisterModifytime(TimeUtil.getStringSecond());
		hotelRegisterMapper.updateByPrimaryKeySelective(hotelRegister1);

	}

}
