package com.wojciechpietrak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wojciechpietrak.model.Meeting;
import com.wojciechpietrak.service.MeetingService;

@Controller
public class MeetingController {

	@Autowired
	private MeetingService meetingService;

	@RequestMapping(value = "/meetings", method = RequestMethod.GET)
	public String getMeetingsPage(Model model) {

		List<Meeting> meetingList = meetingService.findAll();
		model.addAttribute("meetingList", meetingList);
		return "meetings";
	}

	@RequestMapping(value = "/meeting/create", method = RequestMethod.GET)
	public String getCreateMeetingForm(Model model) {
		//musimy zapenić obiekt aby "coś" dać pod akcję edycji książki która odsyła na tą samą stronę
		model.addAttribute("meeting", new Meeting());
		return "meeting-create";
	}
	
	@RequestMapping(value="/meeting/edit/{id}", method=RequestMethod.GET)
	public String getEditMeetingForm(Model model, @PathVariable Long id){
		Meeting meeting = meetingService.findById(id);
		model.addAttribute("meeting", meeting );
		return "meeting-create";
	}

	@RequestMapping(value = "/meeting/save", method = RequestMethod.POST)
	public String postCreateMeeting(@ModelAttribute Meeting meeting) {
		meetingService.save(meeting);
		return "redirect:/meetings";
	}
	@RequestMapping (value = "/meeting/delete/{id}", method = RequestMethod.POST)
	public String postDeleteMeeting(@PathVariable Long id){
		meetingService.delete(id);
		return "redirect:/meetings";
	}

}
