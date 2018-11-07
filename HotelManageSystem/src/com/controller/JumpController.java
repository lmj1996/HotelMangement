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
	
	@RequestMapping(value="/jumpToLogin")
	public ModelAndView jumpToLogin() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping(value="/jumpToHome")
	public ModelAndView jumpToHome(@ModelAttribute("session") SessionDTO session,Model model) {
		//修改部分session内容
		session.setChoice("1");
		model.addAttribute(session);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
}
