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
			System.out.println("更新成功");
			modelAndView.addObject("state", "updateRoom");
			modelAndView.setViewName("room/room_list");
			return modelAndView;
		} else {
			System.out.println("更新失败");
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
			System.out.println("住宿登记成功");
			modelAndView.addObject("state", "stayOverNight");
			modelAndView.setViewName("room/room_list");
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
			System.out.println("添加成功");
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
			System.out.println("修改成功");
			modelAndView.addObject("state", "updateChargingWay");
			modelAndView.setViewName("room/room_charge");
			return modelAndView;
		} else {
			System.out.println("修改失败");
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
			System.out.println("删除成功");
			modelAndView.addObject("state", "deleteChargingWay");
			modelAndView.setViewName("room/room_charge");
			return modelAndView;
		} else {
			System.out.println("删除失败");
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
	 * 结账操作
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

}
