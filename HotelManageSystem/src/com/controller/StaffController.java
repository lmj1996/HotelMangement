package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.DTO.*;
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
	@RequestMapping(value="/login")
	public ModelAndView login(Staff staff, Model model) {
		SessionDTO session = new SessionDTO();
		ModelAndView modelAndView = new ModelAndView();
				Staff staffInfo = staffService.getStaffInfo(staff.getStaffNum(), staff.getStaffPassword());
				if(staffInfo!=null) {
					session.setStaff(staffInfo);
					model.addAttribute("session", session);
					modelAndView.setViewName("home");
					return modelAndView;
				}
			
		return null;
	}

}
