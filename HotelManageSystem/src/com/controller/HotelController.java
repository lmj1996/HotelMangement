package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.DTO.*;
import com.VO.*;
import com.google.gson.Gson;
import com.pojo.*;
import com.service.HotelService;

@Controller

@RequestMapping("/hotel")
@SessionAttributes("session")
public class HotelController {
	@Resource(name = "hotelService")
	private HotelService hotelService;

	/**
	 * 查询所有房间(gson)
	 * 
	 * @param roomVO
	 * @param page
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllRoom")
	public void getAllRoom(RoomVO roomVO, int page, HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("session") SessionDTO session, Model model) throws IOException {
		// 修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);

		roomVO.setPageIndex(page);
		RoomVO getRoomVO = hotelService.queryAllRoom(roomVO);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(getRoomVO));

	}

	/**
	 * 添加房间
	 * 
	 * @param room
	 * @return
	 */
	@RequestMapping(value = "/addRoom")
	public ModelAndView addRoom(Room room) {
		ModelAndView modelAndView = new ModelAndView();
		String add = hotelService.addRoom(room);
		if (add.equals("success")) {
			modelAndView.addObject("state", "addRoom");
			modelAndView.setViewName("room/room_list");
			return modelAndView;
		} else {
			return null;
		}
	}

	/**
	 * 更新房间信息
	 * 
	 * @param room
	 * @return
	 */
	@RequestMapping(value = "/updateRoom")
	public ModelAndView updateRoom(Room room) {
		ModelAndView modelAndView = new ModelAndView();
		String update = hotelService.updateRoom(room);
		if (update.equals("success")) {
			modelAndView.addObject("state", "updateRoom");
			modelAndView.setViewName("room/room_list");
			return modelAndView;
		} else {
			return null;
		}
	}

	/**
	 * 顾客住宿登记
	 * 
	 * @param room
	 * @param customer
	 * @param hotelRegister
	 * @param recharge
	 * @return
	 */
	@RequestMapping(value = "/customerStayOverNight")
	public ModelAndView customerStayOverNight(Room room, Customer customer, HotelRegister hotelRegister,
			Recharge recharge) {
		String son = hotelService.customerStayOverNight(room, customer, hotelRegister, recharge);
		ModelAndView modelAndView = new ModelAndView();
		if (son.equals("success")) {
			modelAndView.addObject("state", "stayOverNight");
			modelAndView.setViewName("room/room_list");
			return modelAndView;
		} else {
			System.out.println("失败");
			return null;
		}
	}
	
	/**
	 * 前台操作入住登记
	 * @param room
	 * @param customer
	 * @param hotelRegister
	 * @param recharge
	 * @return
	 */
	@RequestMapping(value = "/checkIn")
	public ModelAndView checkIn(Room room, Customer customer, HotelRegister hotelRegister,
			Recharge recharge) {
		Room getRoom = hotelService.getRoom(room);
		String son = hotelService.customerStayOverNight(room, customer, hotelRegister, recharge);
		ModelAndView modelAndView = new ModelAndView();
		if (son.equals("success")) {
			modelAndView.addObject("room", getRoom);
			modelAndView.addObject("customer", customer);
			modelAndView.addObject("hotelRegister", hotelRegister);
			modelAndView.addObject("recharge", recharge);
			modelAndView.setViewName("user/bill");
			return modelAndView;
		} else {
			System.out.println("失败");
			return null;
		}
	}

	/**
	 * 添加计费方式
	 * 
	 * @param chargingWay
	 * @return
	 */
	@RequestMapping(value = "/addChargingWay")
	public ModelAndView addChargingWay(ChargingWay chargingWay) {
		ModelAndView modelAndView = new ModelAndView();
		String s = hotelService.addChargingWay(chargingWay);
		if (s.equals("success")) {
			modelAndView.addObject("state", "addChargingWay");
			modelAndView.setViewName("room/room_charge");
			return modelAndView;
		} else {
			System.out.println("添加失败");
			return null;
		}
	}

	/**
	 * 计费方式列表(void)
	 * 
	 * @param request
	 * @param response
	 * @param session
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/getChargingWay")
	public void getChargingWay(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("session") SessionDTO session, Model model) throws IOException {
		// 修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);

		List<ChargingWay> listChargingWay = new ArrayList<>();
		listChargingWay = hotelService.queryChargingWay();
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(listChargingWay));
	}

	/**
	 * 修改计费方式
	 * 
	 * @param chargingWay
	 * @return
	 */
	@RequestMapping(value = "/updateChargingWay")
	public ModelAndView updateChargingWay(ChargingWay chargingWay) {
		ModelAndView modelAndView = new ModelAndView();
		String s = hotelService.updateChargingWay(chargingWay);
		if (s.equals("success")) {
			modelAndView.addObject("state", "updateChargingWay");
			modelAndView.setViewName("room/room_charge");
			return modelAndView;
		} else {
			return null;
		}
	}

	/**
	 * 删除计费方式
	 * 
	 * @param chargingWay
	 * @return
	 */
	@RequestMapping(value = "/deleteChargingWay")
	public ModelAndView deleteChargingWay(ChargingWay chargingWay) {
		ModelAndView modelAndView = new ModelAndView();
		String s = hotelService.deleteChargingWay(chargingWay);
		if (s.equals("success")) {
			modelAndView.addObject("state", "deleteChargingWay");
			modelAndView.setViewName("room/room_charge");
			return modelAndView;
		} else {
			return null;
		}
	}

	/**
	 * 获得结账信息
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/getCheckOutInfo")
	public void getCheckOutInfo(String roomId, HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("session") SessionDTO session, Model model) throws IOException {
		// 修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);

		System.out.println("结账：" + roomId);
		CheckOutDTO checkOutDTO = new CheckOutDTO();
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		if (roomId != null && roomId.trim().length() > 0) {
			checkOutDTO = hotelService.getCheckOutInfo(roomId);
			response.getWriter().println(gson.toJson(checkOutDTO));
		}
	}

	/**
	 * 后台结账操作
	 */
	@RequestMapping(value = "/checkOut")
	public ModelAndView checkOut(Room room, Customer customer, HotelRegister hotelRegister,
			@ModelAttribute("session") SessionDTO session, Model model) {
		// 修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);
		
		hotelService.checkOut(room,customer,hotelRegister);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("state", "checkSuccess");
		modelAndView.setViewName("room/room_list");
		return modelAndView;
	}
	
	/**
	 * 前台结账操作
	 */
	@RequestMapping(value = "/checkOut1")
	public ModelAndView checkOut1(Room room, Customer customer, HotelRegister hotelRegister) {
		
		
		hotelService.checkOut(room,customer,hotelRegister);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/room");
		return modelAndView;
	}

	/**
	 * 根据房间类型随机获得一个房间ID
	 * @throws IOException 
	 */
	@RequestMapping(value = "/getRoomId")
	public void getRoomId(String type,HttpServletRequest request, HttpServletResponse response) throws IOException {
		String roomId = hotelService.getRoomIdByType(type);
		System.out.println(roomId);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(roomId));
	}
	
	/**
	 * 首页动态信息
	 * @throws IOException 
	 */
	@RequestMapping(value = "/getIndexInfo")
	public void getIndexInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		IndexInfoDTO indexInfoDTO = hotelService.getIndexInfo();
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(indexInfoDTO));
	}
	
	/**
	 * 前台接待员操作的房间信息
	 * @param request
	 * @param response
	 * @param search
	 * @throws IOException 
	 */
	@RequestMapping(value = "/indexRoomInfo")
	public void indexRoomInfo(HttpServletRequest request, HttpServletResponse response,String search) throws IOException {
		List<Room> list = hotelService.getIndexRoomInfo(search);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(list));
	}
	
	/**
	 * 房间统计信息
	 * @param request
	 * @param response
	 * @param search
	 * @throws IOException
	 */
	@RequestMapping(value = "/indexRoomTypeInfo")
	public void indexRoomTypeInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		TotalRoomDTO totalRoomDTO = hotelService.getIndexRoomTypeInfo();
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(totalRoomDTO));
	}
	
}
