package com.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.DTO.*;
import com.VO.*;
import com.google.gson.Gson;
import com.pojo.*;
import com.service.*;

@Controller

@RequestMapping("/staff")
@SessionAttributes("sc")
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
			if (staffInfo.getStaffPosition().equals("98fa7253-2a2a-48f7-8aa4-c4cef91ef991")) {
				session.setStaff(staffInfo);
				model.addAttribute("session", session);
				modelAndView.setViewName("user/index");
				return modelAndView;
			}
			session.setStaff(staffInfo);
			session.setChoice("1");
			model.addAttribute("session", session);
			modelAndView.setViewName("home");
			return modelAndView;
		}
		modelAndView.addObject("state", "error");
		modelAndView.setViewName("login");
		return modelAndView;
	}

	/**
	 * 添加员工
	 */
	@RequestMapping(value = "/addStaff")
	public ModelAndView addStaff(Staff staff, Model model) {

		ModelAndView modelAndView = new ModelAndView();
		String s = staffService.insertStaff(staff);
		if (s == "success") {
			modelAndView.addObject("state", "addStaff");
			modelAndView.setViewName("staff/staff_list");
			return modelAndView;
		} else {
			modelAndView.addObject("state", "addStaffError");
			modelAndView.setViewName("staff/staff_add");
			return modelAndView;
		}
	}

	/**
	 * 员工列表
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllStaff")
	public void getAllStaff(StaffVO staffVO, int page, HttpServletRequest request, HttpServletResponse response) throws IOException {
		

		staffVO.setPageIndex(page);
		StaffVO getStaffVO = staffService.getAllStaffInfo(staffVO);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(getStaffVO));
	}

	/**
	 * 获得所有职位
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllPosition")
	public void getAllPosition(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Position> listPosition = staffService.getAllPosition();
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(listPosition));
	}

	/**
	 * 查询员工信息
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "/getStaffInfo")
	public void getStaffInfo(HttpServletRequest request, HttpServletResponse response, String id) throws IOException {
		Staff staffInfo = staffService.getStaffInfoById(id);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(staffInfo));
	}

	/**
	 * 更新员工信息
	 * 
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateStaff")
	public ModelAndView updateStaff(Staff staff, Model model) {

		ModelAndView modelAndView = new ModelAndView();
		String check = staffService.updateStaffInfo(staff);
		if (check == "updateStaff") {
			modelAndView.addObject("state", check);
			modelAndView.setViewName("staff/staff_list");
		} else {
			modelAndView.addObject("state", check);
			modelAndView.setViewName("staff/staff_detail");
		}
		return modelAndView;
	}

	/**
	 * 验证身份证号是否重复
	 */
	@RequestMapping(value = "/checkIDnumber")
	public void checkIDnumber(HttpServletRequest request, HttpServletResponse response, String IDnumber, String id)
			throws IOException {
		String check = staffService.checkIDnumberIsRepeat(IDnumber, id);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(check));
	}

	/**
	 * 验证身份证号是否重复
	 */
	@RequestMapping(value = "/checkPhoneNumber")
	public void checkPhoneNumber(HttpServletRequest request, HttpServletResponse response, String phoneNumber,
			String id) throws IOException {
		String check = staffService.checkPhoneNumberIsRepeat(phoneNumber, id);
		response.setContentType("text/html; charset=utf-8");
		Gson gson = new Gson();
		response.getWriter().println(gson.toJson(check));
	}

	// shiro测试登录
	@RequestMapping(value = "/login2")
	public String login2(Staff staff, Model model, HttpServletRequest request) {
		Subject currentUser = SecurityUtils.getSubject();
		
		UsernamePasswordToken token = new UsernamePasswordToken(staff.getStaffNum(), staff.getStaffPassword());
		try {
			currentUser.login(token);
		} catch (UnknownAccountException e) {
			e.printStackTrace();
			model.addAttribute("userName", "用户名错误！");
			return "login";
		} catch (IncorrectCredentialsException e) {
			e.printStackTrace();
			model.addAttribute("passwd", "密码错误");
			return "login";
		}

		//currentUser.hasRole("room-manager");
		//HttpSession session1 = request.getSession();
		// PrincipalCollection pc=currentUser.getPrincipals();
		//Object value = session1.getAttribute("currentUser");
		SessionDTO session = new SessionDTO();
		session.setChoice("1");
		Staff st = (Staff) currentUser.getPrincipal();
		if(st.getStaffPosition().equals("98fa7253-2a2a-48f7-8aa4-c4cef91ef991")) {
			model.addAttribute("sc", session);
			return "user/index";
		}
		
		model.addAttribute("sc", session);
		model.addAttribute(currentUser);
		return "home";
	}
	
	/**
	 * 注销
	 */
	@RequestMapping(value = "/logout")
	public String logout() {
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		return "login";
	}
}
