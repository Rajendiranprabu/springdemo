package com.manipal.restdemo.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.restdemo.demo.model.Product;
import com.manipal.restdemo.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	List<Product> productList=new ArrayList<Product>();
	
	public ProductService() {
		// TODO Auto-generated constructor stub
//		productList.add(new Product(1001, "Samsung s10", 20));
//		productList.add(new Product(1002, "one plus 8", 10));
	}
	
	public List<Product> getProducts()
	{
		
		return productRepository.findAll();
		
	}
	
	
	public void addProducts(Product product)
	{
		
		productRepository.save(product);
	}

	
	public List<Product> deleteProducts(int id)
	{
		Iterator<Product> ie=productList.iterator();
		
		while(ie.hasNext())
		{
			if(ie.next().getProductId()==id)
			{
				ie.remove();
			}
		}
		
		return productList;
	}
	
	
	public Product  getProductById(int id)
	{
		Product p=null;
		
		Optional<Product> product= productRepository.findById(id);
		
		if(product.isPresent())
		{
			 p=product.get();
		}
		
		return p;
		
	}
}
