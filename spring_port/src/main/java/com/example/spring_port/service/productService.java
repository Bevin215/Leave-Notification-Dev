package com.example.spring_port.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_port.models.Product;
import com.example.spring_port.repository.productRepository;

@Service
public class productService {
	@Autowired
	private productRepository productRepository;
	

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}


}
