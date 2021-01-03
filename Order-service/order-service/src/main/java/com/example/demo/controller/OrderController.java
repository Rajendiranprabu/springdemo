package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Customer;
import com.example.demo.Product;

@RestController
public class OrderController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	public List<Customer> getCustomer()
	{
		
		List<Customer> customerList=restTemplate.getForObject("http://customer-service/customers",List.class);
		return customerList;
	}
	@RequestMapping("/products")
	public List<Product> getProducts()
	{
		
		List<Product> customerList=restTemplate.getForObject("http://products-service/products",List.class);
		return customerList;
	}
}
