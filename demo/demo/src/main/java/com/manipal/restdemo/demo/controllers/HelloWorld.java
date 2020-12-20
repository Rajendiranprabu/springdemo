package com.manipal.restdemo.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getString()
	{
		return "Welcome to RESTAPI";
	}
}
