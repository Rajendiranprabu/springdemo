package com.manipal.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/login.htm")
	public String welcome()
	{
		System.out.println("Called");
		return "index";
	}
}
