package com.manipal.restdemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manipal.restdemo.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
