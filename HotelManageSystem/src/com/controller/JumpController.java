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
@SessionAttributes("session")
public class JumpController {
	
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping(value="/jumpToLogin")
	public ModelAndView jumpToLogin() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	/**
	 * 首页
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/jumpToHome")
	public ModelAndView jumpToHome(@ModelAttribute("session") SessionDTO session,Model model) {
		//修改部分session内容
		session.setChoice("1");
		model.addAttribute(session);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
	/**
	 * 计费方式
	 * @return
	 */
	@RequestMapping(value="/jumpToChargeWay")
	public ModelAndView jumpToChargeWay() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("room/room_charge");
		return modelAndView;
	}
	
	/**
	 * 房间列表
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/jumpToRoomList")
	public ModelAndView jumpToRoomList(@ModelAttribute("session") SessionDTO session,Model model) {
		//修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("room/room_list");
		return modelAndView;
	}
	
	/**
	 * 添加房间
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/jumpToRoomAdd")
	public ModelAndView jumpToRoomAdd(@ModelAttribute("session") SessionDTO session,Model model) {
		//修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("room/add_room");
		return modelAndView;
	}
	
	/**
	 * 住宿登记 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/jumpToStayRegister")
	public ModelAndView jumpToStayRegister(@ModelAttribute("session") SessionDTO session,Model model,String roomId) {
		//修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("roomId", roomId);
		modelAndView.setViewName("room/customer_stay_register");
		return modelAndView;
	}
	
	/**
	 * 结账 
	 * @param session
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/jumpToCheckOut")
	public ModelAndView jumpToCheckOut(@ModelAttribute("session") SessionDTO session,Model model,String roomId) {
		//修改部分session内容
		session.setChoice("2");
		model.addAttribute(session);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("roomId", roomId);
		modelAndView.setViewName("room/check_out");
		return modelAndView;
	}
	
}
