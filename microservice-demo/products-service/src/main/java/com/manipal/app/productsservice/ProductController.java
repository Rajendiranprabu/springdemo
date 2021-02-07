package com.manipal.app.productsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@GetMapping("products")
	public String welcomeMessage()
	{
		return "Products are available";
	}

}
