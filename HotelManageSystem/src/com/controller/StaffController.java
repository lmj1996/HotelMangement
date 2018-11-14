package com.controller;

import java.io.IOException;
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
import com.VO.StaffVO;
import com.google.gson.Gson;
import com.pojo.*;
import com.service.*;

@Controller

@RequestMapping("/staff")
@SessionAttributes("session")
public class StaffController {
	@Resource(name = "staffService")
	private StaffService staffService;

	/**
	 * 登录
	 */
	@RequestMapping(value = "/login")
	public ModelAndView login(Staff staff, Model model) {
		SessionDTO session = new SessionDTO();
		ModelAndView modelAndView = new ModelAndView();
		Staff staffInfo = staffService.getStaffInfo(staff.getStaffNum(), staff.getStaffPassword());
		if (staffInfo != null) {
			session.setStaff(staffInfo);
			session.setChoice("1");
			model.addAttribute("session", session);
			modelAndView.setViewName("home");
			return modelAndView;
		}
		modelAndView.setViewName("login");
		return modelAndView;
	}

	/**
	 * 添加员工
	 */
	@RequestMapping(value = "/addStaff")
	public ModelAndView addStaff(Staff staff, @ModelAttribute("session") SessionDTO session, Model model) {
		// 修改部分session内容
		session.setChoice("3");
		model.addAttribute(session);

		ModelAndView modelAndView = new ModelAndView();
		String s = staffService.insertStaff(staff);
		if(s == "success") {
		modelAndView.setViewName("staff/staff_list");
		return modelAndView;
		}else {
			modelAndView.setViewName("staff/staff_add");
			return modelAndView;
		}
	}

	/**
	 * 员工列表
	 * @throws IOException 
	 */
	@RequestMapping(value = "/getAllStaff")
	public void getAllStaff(StaffVO staffVO, int page, HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("session") SessionDTO session, Model model) throws IOException {
		// 修改部分session内容
		session.setChoice("3");
		model.addAttribute(session);

		staffVO.setPageIndex(page);
		StaffVO getStaffVO = staffService.getAllStaffInfo(staffVO);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(getStaffVO));
	}
	
	/**
	 * 获得所有职位
	 * @throws IOException 
	 */
	@RequestMapping(value = "/getAllPosition")
	public void getAllPosition(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Position> listPosition = staffService.getAllPosition();
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(listPosition));
	}

}
