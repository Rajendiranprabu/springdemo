package com.manipal.mvcdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.mvcdemo.services.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService as;
	
	@RequestMapping("/admin.htm")
	public ModelAndView getAdmin()
	{
		ModelAndView mv=new ModelAndView("admin");
		String msg=as.getInfo();
		mv.addObject("msg",msg);
		
		return mv;
	}
}
