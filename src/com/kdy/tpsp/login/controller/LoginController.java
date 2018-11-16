package com.kdy.tpsp.login.controller;

import javax.annotation.Resource;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kdy.tpsp.login.model.User;
import com.kdy.tpsp.login.service.IUserService;

@Controller
@RequestMapping("/Login")
public class LoginController {

	@Resource
	private IUserService userService;

	@RequestMapping("/index")
	public String printHello(User user, HttpServletRequest request) {
		return "login/index";
	}

}