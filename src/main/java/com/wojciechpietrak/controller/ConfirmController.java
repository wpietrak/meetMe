package com.wojciechpietrak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wojciechpietrak.model.Confirmed;
import com.wojciechpietrak.service.ConfirmService;

@Controller
public class ConfirmController {
	
	@Autowired
	private ConfirmService confirmService; 
	
	@RequestMapping(value="/confirmed", method = RequestMethod.GET)
	public String getRentsPage(Model model){
		
		List<Confirmed> confirmedList = confirmService.findAll();
		model.addAttribute("confirmedList", confirmedList);
			
		return "confirmed"; 
	}

}
