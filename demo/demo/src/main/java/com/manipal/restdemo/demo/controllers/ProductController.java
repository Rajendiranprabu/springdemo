package com.manipal.restdemo.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.restdemo.demo.model.Product;
import com.manipal.restdemo.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public List<Product> getProducts(){
		
		return productService.getProducts();
	}
	
	
	
	@RequestMapping(value="/products", method = RequestMethod.POST)
	public String addProducts(@RequestBody Product product)
	{
		productService.addProducts(product);
		return "Success";
	}
	
	@RequestMapping(value="/products/{id}", method = RequestMethod.DELETE)
	public List<Product> deleteProduct(@PathVariable int id)
	{
		return productService.deleteProducts(id);
	}
	
	
	@RequestMapping(value="/products/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable int id)
	{
		return productService.getProductById(id);
				
	}

}
