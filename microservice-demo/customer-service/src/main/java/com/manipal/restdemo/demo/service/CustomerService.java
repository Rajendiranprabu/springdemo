package com.manipal.restdemo.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.restdemo.demo.model.CustomerDetails;
import com.manipal.restdemo.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cusomerRepository;
	
	List<CustomerDetails> customerList=new ArrayList<CustomerDetails>();
	
	public CustomerService() {
		// TODO Auto-generated constructor stub
//		productList.add(new Product(1001, "Samsung s10", 20));
//		productList.add(new Product(1002, "one plus 8", 10));
	}
	
	public List<CustomerDetails> getCustomers()
	{
		
		return cusomerRepository.findAll();
		
	}
	
	
	public void addCustomer(CustomerDetails customer)
	{
		
		cusomerRepository.save(customer);
	}

	
	public List<CustomerDetails> deleteCustomer(int id)
	{
		Iterator<CustomerDetails> ie=customerList.iterator();
		
		while(ie.hasNext())
		{
			if(ie.next().getCustomerId()==id)
			{
				ie.remove();
			}
		}
		
		return customerList;
	}
	
	
	public CustomerDetails  getCustomerById(int id)
	{
		CustomerDetails p=null;
		
		Optional<CustomerDetails> product= cusomerRepository.findById(id);
		
		if(product.isPresent())
		{
			 p=product.get();
		}
		
		return p;
		
	}
}
