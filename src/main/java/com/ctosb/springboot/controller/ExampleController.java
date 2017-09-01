
package com.ctosb.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctosb.springboot.model.User;
import com.ctosb.springboot.service.UserService;

@Controller
public class ExampleController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public Object addUser(@RequestBody User user) {
		return userService.insert(user);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	public Object get(@RequestParam("name") String name) {
		return userService.getByName(name + "%");
	}
}
