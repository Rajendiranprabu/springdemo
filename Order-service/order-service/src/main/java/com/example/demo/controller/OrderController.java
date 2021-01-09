package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Customer;
import com.example.demo.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

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
	@CircuitBreaker(name="mainService" ,fallbackMethod = "getDummyProducts")
	public List<Product> getProducts()
	{
		
		List<Product> customerList=restTemplate.getForObject("http://localhost:8022/products",List.class);
		return customerList;
	}
	
	public List<Product> getDummyProducts(Throwable t)
	{
		return new ArrayList<Product>();
		
	}
}
