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


	// 查询所有房间
	@RequestMapping(value = "/getAllRoom")
	public ModelAndView getAllRoom(RoomVO roomVO, int page,@ModelAttribute("session") SessionDTO session,Model model) {
		//修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);
		
		roomVO.setPageIndex(page);
		ModelAndView mv = new ModelAndView();
		try {
			RoomVO getRoomVO = hotelService.queryAllRoom(roomVO);
			mv.setViewName("room/room_list");
			mv.addObject("getRoomVO", getRoomVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;

	}

	/**
	 *  查询所有房间(gson)
	 * @param roomVO
	 * @param page
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllRoom2")
	public void getAllRoom2(RoomVO roomVO, int page, HttpServletRequest request, HttpServletResponse response,@ModelAttribute("session") SessionDTO session,Model model)
			throws IOException {
		//修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);
		
		roomVO.setPageIndex(page);
		RoomVO getRoomVO = hotelService.queryAllRoom(roomVO);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(getRoomVO));
		
	}

	// 添加房间
	@RequestMapping(value = "/addRoom")
	public ModelAndView addRoom(Room room) {
		ModelAndView modelAndView = new ModelAndView();
		String add = hotelService.addRoom(room);
		if (add.equals("success")) {
			System.out.println("添加成功");
			modelAndView.setViewName("room/room_list");
			return modelAndView;
		} else {
			System.out.println("添加失败");
			return null;
		}
	}

	// 更新房间信息
	@RequestMapping(value = "/updateRoom")
	public String updateRoom(Room room) {
		String update = hotelService.updateRoom(room);
		if (update.equals("success")) {
			System.out.println("更新成功");
			return "success";
		} else {
			System.out.println("更新失败");
			return null;
		}
	}

	// 顾客住宿登记
	@RequestMapping(value = "/customerStayOverNight")
	public ModelAndView customerStayOverNight(Room room, Customer customer, HotelRegister hotelRegister,Recharge recharge) {
		String son = hotelService.customerStayOverNight(room, customer, hotelRegister,recharge);
		ModelAndView modelAndView = new ModelAndView();
		if(son.equals("success")) {
			System.out.println("住宿登记成功");
			modelAndView.setViewName("room/room_list");
			return modelAndView;
		}else {
			System.out.println("失败");
		return null;
		}
	}
	
	// 添加计费方式
	@RequestMapping(value = "/addChargingWay")
	public String addChargingWay(ChargingWay chargingWay) {
		String s = hotelService.addChargingWay(chargingWay);
		if(s.equals("success")) {
			System.out.println("添加成功");
			return "success";
		}else {
			System.out.println("添加失败");
			return null;
		}
	}
	
	// 计费方式列表
	@RequestMapping(value = "/queryChargingWay")
	public ModelAndView queryChargingWay() {
		ModelAndView modelAndView = new ModelAndView();
		List<ChargingWay> listChargingWay = new ArrayList<>();
		listChargingWay = hotelService.queryChargingWay();
		modelAndView.addObject("listChargingWay", listChargingWay);
		modelAndView.setViewName("room/room_charge");
		return modelAndView;
		
	}
	
	// 修改计费方式
	@RequestMapping(value = "/updateChargingWay")
	public String updateChargingWay(ChargingWay chargingWay) {
		String s = hotelService.updateChargingWay(chargingWay);
		if(s.equals("success")) {
			System.out.println("添加成功");
			return "success";
		}else {
			System.out.println("添加失败");
			return null;
		}
	}
}
