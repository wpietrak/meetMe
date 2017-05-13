package com.wojciechpietrak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wojciechpietrak.model.User;
import com.wojciechpietrak.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage(){
		return "home";
	}
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String getLoginPage(){
		return "login"; 
	}
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String getRegisterPage(){
		return "register"; 
	}
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(@ModelAttribute User user){
		
		userService.save(user);
		return "redirect:/login"; 
	}
}
