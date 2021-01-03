package com.manipal.restdemo.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.restdemo.demo.model.CustomerDetails;
import com.manipal.restdemo.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/customers", method = RequestMethod.GET)
	public List<CustomerDetails> getProducts(){
		System.out.println("Prot 8072");

		return customerService.getCustomers();
	}
	
	
	
	@RequestMapping(value="/customers", method = RequestMethod.POST)
	public String addProducts(@RequestBody CustomerDetails customer)
	{
		System.out.println("Prot 8072");
		customerService.addCustomer(customer);
		return "Success";
	}
	
	@RequestMapping(value="/customer/{id}", method = RequestMethod.DELETE)
	public List<CustomerDetails> deleteProduct(@PathVariable int id)
	{
		return customerService.deleteCustomer(id);
	}
	
	
	@RequestMapping(value="/customer/{id}", method = RequestMethod.GET)
	public CustomerDetails getProduct(@PathVariable int id)
	{
		return customerService.getCustomerById(id);
				
	}

}
