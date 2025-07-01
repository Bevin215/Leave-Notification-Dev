package com.example.spring_port.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_port.models.Product;
import com.example.spring_port.service.productService;

@RestController
@RequestMapping("/products")
public class controller {
	@Autowired
	private productService productService;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	@GetMapping("/category")
	public List<Map<String,Object>> getAllProducts1(){
		return Arrays.asList(
				Map.of("name","product 1","price","13555"),
				Map.of("name","product 2","price","123")
				);
	}
}
	