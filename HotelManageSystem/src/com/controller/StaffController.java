package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.pojo.Staff;
import com.service.StaffService;
import com.util.GetSession;

@Controller

@RequestMapping("/staff")

public class StaffController {
	@Resource(name = "staffService")
	private StaffService staffService;

	/**
	 * 登录
	 */
	@RequestMapping(value="/login")
	public ModelAndView login(Staff staff) {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = GetSession.getSession();

				Staff staffInfo = staffService.getSession(staff.getStaffNum(), staff.getStaffPassword());
				if(staffInfo!=null) {
					session.setAttribute("staff", staffInfo);
					modelAndView.setViewName("home");
					return modelAndView;
				}
			
		return null;
	}

}
