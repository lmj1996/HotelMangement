package com.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

	@Resource
	private AddConsumptionMapper addConsumptionMapper;

	// 添加房间
	public String addRoom(Room room) {
		String x = "LT-";
		List<Room> listRoom = new ArrayList<>();
		listRoom = roomMapper.getRoomByFloor(room.getRoomFloor());
		if(listRoom != null) {
			String maxNumber = roomMapper.getMaxNumber(room.getRoomFloor());
			if(maxNumber != null) {
			int nextNumber = Integer.parseInt(maxNumber);
			nextNumber = nextNumber + 1;
			String number = String.format("%03d", nextNumber);
			room.setRoomNum(x+room.getRoomFloor()+"-"+number);
			}else {
				room.setRoomNum(x+room.getRoomFloor()+"-"+"001");
			}
		}else {
			room.setRoomNum(x+room.getRoomFloor()+"-"+"001");
		}
		room.setRoomId(BuildUuid.getUuid());
		room.setRoomState("空闲");
		room.setRoomCreatetime(TimeUtil.getStringSecond());
		room.setRoomModifytime(TimeUtil.getStringSecond());
		roomMapper.insertSelective(room);
		return "success";
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
		room.setRoomRemarks("无");
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
				customer.setCustomerVipLevel("0");
				customerMapper.insertSelective(customer);
				recharge.setRechargeCustomer(customer.getCustomerId());
				hotelRegister.setHotelRegisterCustomer(customer.getCustomerId());
			}
			recharge.setRechargeId(BuildUuid.getUuid());
			recharge.setRechargeTime(TimeUtil.getStringSecond());
			rechargeMapper.insertSelective(recharge);

			hotelRegister.setHotelRegisterId(BuildUuid.getUuid());
			hotelRegister.setHotelRegisterRoom(room.getRoomId());
			// hotelRegister.setHotelRegisterStarttime(TimeUtil.getStringSecond());
			hotelRegister.setHotelRegisterCreatetime(TimeUtil.getStringSecond());
			hotelRegister.setHotelRegisterModifytime(TimeUtil.getStringSecond());
			hotelRegisterMapper.insertSelective(hotelRegister);

			room.setRoomState("已入住");
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
		// 会员折扣情况
		int discount = Integer.parseInt(customer.getCustomerVipLevel());
		discount = 10 - discount;

		// 服务消费
		int service = 0;
		AddConsumptionExample aConsumptionExample = new AddConsumptionExample();
		com.pojo.AddConsumptionExample.Criteria criteria = aConsumptionExample.createCriteria();
		criteria.andAddConsumptionCustomerEqualTo(customer.getCustomerId());
		criteria.andAddConsumptionRoomEqualTo(roomId);
		List<AddConsumption> listadd = addConsumptionMapper.selectByExample(aConsumptionExample);
		if (listadd != null) {
			for (AddConsumption addConsumption : listadd) {
				String d = TimeUtil.getStringSecond();
				String d1 = hotelRegister.getHotelRegisterCheckinday();
				String d2 = hotelRegister.getHotelRegisterStarttime();
				d2 = d2.replace(" ", "");
				d1 = d1 + " " + d2 + ":00";
				long a1 = TimeCount.getDay(d1, addConsumption.getAddConsumptionTime());
				long a2 = TimeCount.getDay(addConsumption.getAddConsumptionTime(), d);
				int aa = (int) a1;
				int ab = (int) a2;
				if (aa >= 0 && ab >= 0) {
					int sc = Integer.parseInt(addConsumption.getAddConsumptionPrice());
					service = service + sc;
				}
			}
		}

		String currentTime = TimeUtil.getStringSecond();
		// 总消费
		String totalPrice;
		// 房间消费
		String roomCost;
		// 服务消费
		String serviceCost;
		// 余额
		String settleMoney;
		String d1 = hotelRegister.getHotelRegisterCheckinday();
		String d2 = hotelRegister.getHotelRegisterStarttime();
		d2 = d2.replace(" ", "");
		d1 = d1 + " " + d2 + ":00";
		long hour;
		long count = TimeCount.getDay(d1, currentTime);
		long base = Long.parseLong(room.getRoomPrice());
		// 根据居住时间计算费用
		int a = (int) count;
		if (a == 0) {
			hour = TimeCount.getHours(d1, currentTime);
			int h = (int) hour;
			if (h >= 6) {
				a = a + 1;
			}
		}
		int b = (int) base;
		int total = a * b * discount / 10;
		roomCost = total + "";
		checkOutDTO.setRoomCost(roomCost);
		long balance = Long.parseLong(customer.getCustomerBalance());
		int security = Integer.parseInt(hotelRegister.getHotelRegisterSecurity());
		balance = balance - total + security;
		if (hotelRegister.getHotelRegisterTotalprice() != null
				&& hotelRegister.getHotelRegisterTotalprice().trim().length() > 0) {
			long other = Long.parseLong(hotelRegister.getHotelRegisterTotalprice());
			int c = (int) other;
			total = total + c;
		}
		total = total + service;
		totalPrice = total + "";
		serviceCost = service + "";
		settleMoney = balance + "";

		String cd = TimeUtil.getStringDay();
		hotelRegister.setHotelRegisterCheckoutday(cd);
		hotelRegister.setHotelRegisterTotalprice(totalPrice);
		checkOutDTO.setCustomer(customer);
		checkOutDTO.setHotelRegister(hotelRegister);
		checkOutDTO.setServiceCost(serviceCost);
		checkOutDTO.setSettleMoney(settleMoney);
		checkOutDTO.setRoom(room);
		return checkOutDTO;
	}

	// 结账操作
	public void checkOut(Room room, Customer customer, HotelRegister hotelRegister) {
		// 房间操作
		Room room1 = roomMapper.selectByPrimaryKey(room.getRoomId());
		room1.setRoomState("清扫中");
		room1.setRoomRemarks("脏");
		room1.setRoomModifytime(TimeUtil.getStringSecond());
		roomMapper.updateByPrimaryKeySelective(room1);

		// 住宿表操作
		HotelRegister hotelRegister1 = hotelRegisterMapper.selectByRoomId(room.getRoomId());
		hotelRegister1.setHotelRegisterTotalprice(hotelRegister.getHotelRegisterTotalprice());
		hotelRegister1.setHotelRegisterModifytime(TimeUtil.getStringSecond());
		hotelRegisterMapper.updateByPrimaryKeySelective(hotelRegister1);

		// 客户信息操作
		Customer customer1 = customerMapper.selectCustomerByIDnum(customer.getCustomerCustomerid());
		customer1.setCustomerBalance("0");
		HotelRegisterExample hExample = new HotelRegisterExample();
		com.pojo.HotelRegisterExample.Criteria criteria = hExample.createCriteria();
		criteria.andHotelRegisterCustomerEqualTo(customer1.getCustomerId());
		List<HotelRegister> list = hotelRegisterMapper.selectByExample(hExample);
		// 总消费
		int c = 0;
		if (list != null) {
			for (HotelRegister hotelRegister2 : list) {
				String a = hotelRegister2.getHotelRegisterTotalprice();
				int b = Integer.parseInt(a);
				c = c + b;
			}
		}
		if (c < 3000 && c >= 0) {
			customer1.setCustomerType("普通会员");
			customer1.setCustomerVipLevel("1");
		} else if (c >= 3000 && c < 10000) {
			customer1.setCustomerType("白银会员");
			customer1.setCustomerVipLevel("2");
		} else if (c >= 10000 && c < 30000) {
			customer1.setCustomerType("黄金会员");
			customer1.setCustomerVipLevel("3");
		} else if (c >= 30000 && c < 100000) {
			customer1.setCustomerType("铂金会员");
			customer1.setCustomerVipLevel("4");
		} else {
			customer1.setCustomerType("钻石会员");
			customer1.setCustomerVipLevel("5");
		}
		customerMapper.updateByPrimaryKeySelective(customer1);
	}

	// 根据房间类型随机获得房间ID
	public String getRoomIdByType(String type) {
		String id = roomMapper.getRoomIdByType(type);
		return id;
	}

	// 获得首页信息
	public IndexInfoDTO getIndexInfo() {
		IndexInfoDTO indexInfoDTO = new IndexInfoDTO();
		/**
		 * 日期
		 */
		List<String> listDate = new ArrayList<>();
		/**
		 * 单人间
		 */
		List<Integer> listSingle = new ArrayList<>();
		/**
		 * 双人间
		 */
		List<Integer> listDouble = new ArrayList<>();
		/**
		 * 普通套房
		 */
		List<Integer> listOrdinary = new ArrayList<>();
		/**
		 * 豪华套房
		 */
		List<Integer> listLuxury = new ArrayList<>();
		/**
		 * 商务间
		 */
		List<Integer> listBusiness = new ArrayList<>();
		/**
		 * 公寓间
		 */
		List<Integer> listApartment = new ArrayList<>();
		/**
		 * 总统套房
		 */
		List<Integer> listPresident = new ArrayList<>();

		Date currentDate = new Date();

		// Date c1 = TimeCount.addAndSubtractDaysByCalendar(currentDate, 0);
		// Date c2 = TimeCount.addAndSubtractDaysByCalendar(currentDate, -1);
		// Date c3 = TimeCount.addAndSubtractDaysByCalendar(currentDate, -2);
		// Date c4 = TimeCount.addAndSubtractDaysByCalendar(currentDate, -3);
		// Date c5 = TimeCount.addAndSubtractDaysByCalendar(currentDate, -4);
		// Date c6 = TimeCount.addAndSubtractDaysByCalendar(currentDate, -5);
		// Date c7 = TimeCount.addAndSubtractDaysByCalendar(currentDate, -6);

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		// 循环获取每日各种房间的居住情况
		for (int i = 1; i < 8; i++) {

			Date date = TimeCount.addAndSubtractDaysByCalendar(currentDate, i - 7);
			String day = df.format(date);
			HotelRegisterExample hotelRegisterExample = new HotelRegisterExample();
			com.pojo.HotelRegisterExample.Criteria criteria = hotelRegisterExample.createCriteria();
			// criteria.andHotelRegisterCheckindayGreaterThanOrEqualTo(day);
			// criteria.andHotelRegisterCheckoutdayLessThanOrEqualTo(day);
			criteria.andHotelRegisterCheckindayEqualTo(day);

			int countSingle = 0;
			int countDouble = 0;
			int countOrdinary = 0;
			int countLuxury = 0;
			int countBusiness = 0;
			int countApartment = 0;
			int countPresident = 0;

			List<HotelRegister> listHotelRegister = hotelRegisterMapper.selectByExample(hotelRegisterExample);
			if (listHotelRegister != null) {
				for (HotelRegister hotelRegister : listHotelRegister) {
					Room room = roomMapper.selectByPrimaryKey(hotelRegister.getHotelRegisterRoom());
					if (room.getRoomType().equals("单人间")) {
						countSingle = countSingle + 1;
					} else if (room.getRoomType().equals("双人间")) {
						countDouble = countDouble + 1;
					} else if (room.getRoomType().equals("普通套房")) {
						countOrdinary = countOrdinary + 1;
					} else if (room.getRoomType().equals("豪华套房")) {
						countLuxury = countLuxury + 1;
					} else if (room.getRoomType().equals("商务间")) {
						countBusiness = countBusiness + 1;
					} else if (room.getRoomType().equals("公寓间")) {
						countApartment = countApartment + 1;
					} else if (room.getRoomType().equals("总统套房")) {
						countPresident = countPresident + 1;
					}

				}

			}

			listDate.add(day);
			listSingle.add(countSingle);
			listDouble.add(countDouble);
			listOrdinary.add(countOrdinary);
			listLuxury.add(countLuxury);
			listBusiness.add(countBusiness);
			listApartment.add(countApartment);
			listPresident.add(countPresident);

			// List<HotelRegister> list = hotelRegisterMapper.getInfoByDate(date);

		}

		// String d7 = df.format(c7);
		// String d6 = df.format(c6);
		// String d5 = df.format(c5);
		// String d4 = df.format(c4);
		// String d3 = df.format(c3);
		// String d2 = df.format(c2);
		// String d1 = df.format(c1);

		indexInfoDTO.setListDate(listDate);
		indexInfoDTO.setListSingle(listSingle);
		indexInfoDTO.setListDouble(listDouble);
		indexInfoDTO.setListOrdinary(listOrdinary);
		indexInfoDTO.setListLuxury(listLuxury);
		indexInfoDTO.setListBusiness(listBusiness);
		indexInfoDTO.setListApartment(listApartment);
		indexInfoDTO.setListPresident(listPresident);

		return indexInfoDTO;
	}

	// 员工操作页面的房间数据
	public List<Room> getIndexRoomInfo(String search) {
		List<Room> listRoom = new ArrayList<>();
		if (search != null && search.trim().length() > 0) {
			RoomExample roomExample = new RoomExample();
			Criteria criteria = roomExample.createCriteria();
			criteria.andRoomNumLike("%" + search + "%");
			criteria.andRoomStateEqualTo("已入住");
			listRoom = roomMapper.selectByExample(roomExample);
			for (Room room : listRoom) {
				room.setRoomNum(
						room.getRoomNum().replaceAll(search, "<span style='color: #ff5063;'>" + search + "</span>"));
				room.setRoomRemarks("正常");
			}
		} else {
			Date current = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String current_day = formatter.format(current);
			String current_time = formatter2.format(current);
			HotelRegisterExample hotelRegisterExample = new HotelRegisterExample();
			com.pojo.HotelRegisterExample.Criteria criteria = hotelRegisterExample.createCriteria();
			criteria.andHotelRegisterCheckoutdayEqualTo(current_day);
			List<HotelRegister> listHotelRegister = hotelRegisterMapper.selectByExample(hotelRegisterExample);
			if (listHotelRegister != null) {
				for (HotelRegister hotelRegister : listHotelRegister) {
					Room roomInfo = roomMapper.selectByPrimaryKey(hotelRegister.getHotelRegisterRoom());

					if (roomInfo.getRoomState().equals("已入住")) {

						String d1 = hotelRegister.getHotelRegisterCheckoutday();
						String d2 = hotelRegister.getHotelRegisterEndtime();
						d2 = d2.replace(" ", "");
						d1 = d1 + " " + d2 + ":00";
						long t = TimeCount.getHours(current_time, d1);
						int a = (int) t;
						if (a <= 0) {
							roomInfo.setRoomRemarks(
									"居住超时" + (-a) + "小时，请<span style='color: #ff5063;'>立刻</span>通知客户结账或者续费！");

						} else if (a > 0 && a <= 3) {
							roomInfo.setRoomRemarks("居住时间不足" + a + "小时，请及时提醒客户结账或者续费！");

						}

						listRoom.add(roomInfo);
					}

				}
			}
		}
		if (listRoom != null) {
			return listRoom;
		} else {
			return null;
		}

	}

	// 获得房间统计信息
	public TotalRoomDTO getIndexRoomTypeInfo() {
		TotalRoomDTO totalRoomDTO = new TotalRoomDTO();
		List<RoomCountDTO> listRoomCountDTO = new ArrayList<>();

		RoomExample roomExample = new RoomExample();
		Criteria criteriaRoom = roomExample.createCriteria();

		RoomExample roomExample2 = new RoomExample();
		Criteria criteriaRoom2 = roomExample2.createCriteria();
		/**
		 * 房间总数
		 */
		int totalRooms = roomMapper.countByExample(null);

		criteriaRoom.andRoomStateEqualTo("已入住");
		/**
		 * 房间入住中总数
		 */
		int usedRooms = roomMapper.countByExample(roomExample);

		criteriaRoom2.andRoomStateEqualTo("清扫中");
		/**
		 * 房间打扫中总数
		 */
		int cleaningRooms = roomMapper.countByExample(roomExample2);
		/**
		 * 房间剩余总数
		 */
		int surplusRooms = totalRooms - usedRooms - cleaningRooms;

		totalRoomDTO.setTotalRooms(totalRooms);
		totalRoomDTO.setUsedRooms(usedRooms);
		totalRoomDTO.setCleaningRooms(cleaningRooms);
		totalRoomDTO.setSurplusRooms(surplusRooms);

		List<String> listType = roomMapper.getRoomType();
		for (String string : listType) {
			RoomExample roomExample3 = new RoomExample();
			Criteria criteriaRoom3 = roomExample3.createCriteria();
			criteriaRoom3.andRoomStateEqualTo("已入住");
			criteriaRoom3.andRoomTypeEqualTo(string);
			RoomExample roomExample4 = new RoomExample();
			Criteria criteriaRoom4 = roomExample4.createCriteria();
			criteriaRoom4.andRoomStateEqualTo("清扫中");
			criteriaRoom4.andRoomTypeEqualTo(string);
			RoomExample roomExample5 = new RoomExample();
			Criteria criteriaRoom5 = roomExample5.createCriteria();
			criteriaRoom5.andRoomTypeEqualTo(string);
			int total = roomMapper.countByExample(roomExample5);
			int used = roomMapper.countByExample(roomExample3);
			int cleaning = roomMapper.countByExample(roomExample4);
			int surplus = total - used - cleaning;
			RoomCountDTO roomCountDTO = new RoomCountDTO();
			roomCountDTO.setRoomType(string);
			roomCountDTO.setTotal(total);
			roomCountDTO.setUsed(used);
			roomCountDTO.setCleaning(cleaning);
			roomCountDTO.setSurplus(surplus);
			listRoomCountDTO.add(roomCountDTO);
		}
		totalRoomDTO.setListDTO(listRoomCountDTO);
		return totalRoomDTO;
	}

	// 获得单个房间信息
	public Room getRoom(Room room) {
		Room getRoom = roomMapper.selectByPrimaryKey(room.getRoomId());
		return getRoom;
	}

	// 删除房间
	public String deleteRoomById(String roomId) {
		if (roomId != null && roomId.trim().length() > 0) {
			Room r = roomMapper.selectByPrimaryKey(roomId);
			if (!r.getRoomState().equals("已入住")) {
				roomMapper.deleteByPrimaryKey(roomId);
				return "deleteRoomSuccess";
			}
		}
		return "deleteRoomError";
	}

}
