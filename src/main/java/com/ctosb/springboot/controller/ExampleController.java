
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
@Api(tags = "案例接口")
public class ExampleController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "默认接口")
	public String home() {
		return "Hello World!";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "新增用户接口")
	public Object addUser(@ApiParam(required = true, name = "user", value = "用户信息") @RequestBody User user) {
		return userService.insert(user);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "查询用户接口")
	public Object get(@ApiParam(required = true, name = "name", value = "名称") @RequestParam("name") String name) {
		return userService.getByName(name + "%");
	}
}
