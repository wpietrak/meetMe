package com.wojciechpietrak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wojciechpietrak.model.User;
import com.wojciechpietrak.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUsers(Model model) {
		List<User> userList = userService.findAll();
		model.addAttribute("userList", userList);
		return "user";
	}

	@RequestMapping(value = "/user/create", method = RequestMethod.GET)
	public String getUserCreateForm(Model model) {
		model.addAttribute("user", new User());
		return "user-create";
	}

	@RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET)
	public String getUpdateUserForm(Model model, @PathVariable Long id) {
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "user-create";
	}

	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	public String createUser(@ModelAttribute User user) {
		userService.save(user);
		return "redirect:/user";
	}

	@RequestMapping(value = "/user/delete/{id}", method = RequestMethod.POST)
	public String deleteUser(@PathVariable Long id) {
		userService.delete(id);
		return "redirect:/user";
	}

}
