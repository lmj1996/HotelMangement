package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.DTO.SessionDTO;

@Controller

@RequestMapping("/jump")
@SessionAttributes("sc")
public class JumpController {

	/**
	 * 登录
	 * 
	 * @return
	 */
	@RequestMapping(value = "/jumpToLogin")
	public ModelAndView jumpToLogin() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	/**
	 * 首页
	 * 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/jumpToHome")
	public ModelAndView jumpToHome(@ModelAttribute("sc") SessionDTO session, Model model) {
		// 修改部分session内容
		session.setChoice("1");
		model.addAttribute(session);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}

	/**
	 * 计费方式
	 * 
	 * @return
	 */
	@RequestMapping(value = "/jumpToChargeWay")
	public ModelAndView jumpToChargeWay() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("room/room_charge");
		return modelAndView;
	}

	/**
	 * 房间列表
	 * 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/jumpToRoomList")
	public ModelAndView jumpToRoomList(@ModelAttribute("sc") SessionDTO session, Model model) {
		// 修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("room/room_list");
		return modelAndView;
	}

	/**
	 * 添加房间
	 * 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/jumpToRoomAdd")
	public ModelAndView jumpToRoomAdd() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("room/add_room");
		return modelAndView;
	}

	/**
	 * 住宿登记
	 * 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/jumpToStayRegister")
	public ModelAndView jumpToStayRegister(@ModelAttribute("session") SessionDTO session, Model model, String roomId) {
		// 修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("roomId", roomId);
		modelAndView.setViewName("room/customer_stay_register");
		return modelAndView;
	}

	/**
	 * 结账
	 * 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/jumpToCheckOut")
	public ModelAndView jumpToCheckOut(@ModelAttribute("session") SessionDTO session, Model model, String roomId) {
		// 修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);

		System.out.println("跳转：" + roomId);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("roomId", roomId);
		modelAndView.setViewName("room/check_out");
		return modelAndView;
	}

	/**
	 * 员工列表
	 */
	@RequestMapping(value = "/jumpToStaffList")
	public ModelAndView jumpToStaffList(@ModelAttribute("sc") SessionDTO session, Model model) {
		// 修改部分session内容
		session.setChoice("3");
		model.addAttribute(session);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("staff/staff_list");
		return modelAndView;

	}

	/**
	 * 添加员工
	 */
	@RequestMapping(value = "/jumpToAddStaff")
	public ModelAndView jumpToAddStaff() {
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("staff/staff_add");
		return modelAndView;

	}
	
	/**
	 * 员工详细信息
	 */
	@RequestMapping(value = "/jumpToStaffDetail")
	public ModelAndView jumpToStaffDetail(String staffId) {
		

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id", staffId);
		modelAndView.setViewName("staff/staff_detail");
		return modelAndView;

	}
	
	// 前台接待员操作
	@RequestMapping(value = "/jumpToStaffHome")
	public ModelAndView jumpToStaffHome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/index");
		return modelAndView;
	}
	
	// 住宿登记
	@RequestMapping(value = "/jumpToCheckIn")
	public ModelAndView jumpToCheckIn() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/check_in");
		return modelAndView;
	}
	
	// 房间信息
	@RequestMapping(value = "/jumpToRoom")
	public ModelAndView jumpToRoom() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/room");
		return modelAndView;
	}
	
	// 结账信息
	@RequestMapping(value = "/jumpToCheckOut2")
	public ModelAndView jumpToCheckOut2(String room_Id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("roomId", room_Id);
		modelAndView.setViewName("user/checkout");
		return modelAndView;
	}
	
	// 库存列表
	@RequestMapping(value = "/jumpToStockList")
	public ModelAndView jumpToStockList(@ModelAttribute("sc") SessionDTO session, Model model) {
		session.setChoice("4");
		model.addAttribute(session);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("stock/stock_list");
		return modelAndView;
	}
	
	// 库存详情
	@RequestMapping(value = "/jumpToStockDetail")
	public ModelAndView jumpToStockDetail(String stockId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("roomId", stockId);
		modelAndView.setViewName("stock/stock_detail");
		return modelAndView;
	}
	
	// 添加库存
	@RequestMapping(value = "/jumpToStockAdd")
	public ModelAndView jumpToStockAdd() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("stock/add_stock");
		return modelAndView;
	}
	
	// 客户消费
	@RequestMapping(value = "/jumpToAddCost")
	public ModelAndView jumpToAddCost(String roomId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("roomId",roomId);
		modelAndView.setViewName("user/add_cost");
		return modelAndView;
	}
}
