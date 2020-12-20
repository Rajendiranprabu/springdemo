package com.manipal.mvcdemo.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AController {

	
	@RequestMapping("/n.htm")
	public String getAdmin()
	{
		System.out.println("Admin");
		return "index";
	}
}
