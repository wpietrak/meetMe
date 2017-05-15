package com.wojciechpietrak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wojciechpietrak.model.Confirmed;
import com.wojciechpietrak.model.Meeting;
import com.wojciechpietrak.service.ConfirmService;
import com.wojciechpietrak.service.MeetingService;

@Controller
public class ConfirmController {

	@Autowired
	private ConfirmService confirmService;

	@Autowired
	private MeetingService meetingService;

	@RequestMapping(value = "/confirmed", method = RequestMethod.GET)
	public String getConfirmedPage(Model model) {
	
		//Sort sort = new Sort(Sort.Direction.DESC, ".....");
		List<Confirmed> confirmedList = confirmService.findAll();
		model.addAttribute("confirmedList", confirmedList);
		
		return "confirmed";
	}

	@RequestMapping(value = "/confirmed/meeting/{meetingId}", method = RequestMethod.POST)
	public String confirmMeeting(@PathVariable Long meetingId, Model model) {

		Meeting meeting = meetingService.findById(meetingId);
		Confirmed confirmed = new Confirmed(meeting);
		confirmService.save(confirmed);

		return "redirect:/confirmed";
	}
}
