package com.example.spring_port;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring_port.models.Product;
import com.example.spring_port.repository.productRepository;

//this is a spring boot component so we use @component
@Component
public class DataSeeder implements CommandLineRunner {
	@Autowired
	private productRepository productRepository;
	@Override
	public void run(String ...args) throws Exception{
		if(productRepository.count()==0) {
			List<Product> products=Arrays.asList(
					new Product("Laptop", 999.99, "High-performance laptop", 4.5, "Electronics", "TechStore", 50, 120),
				    new Product("Smartphone", 699.99, "Latest model smartphone", 4.7, "Electronics", "MobileWorld", 100, 200),
				    new Product("Headphones", 199.99, "Noise-cancelling headphones", 4.3, "Accessories", "SoundShop", 75, 80),
				    new Product("Coffee Maker", 89.99, "Automatic coffee maker", 4.2, "Home Appliances", "HomeGoods", 30, 45),
				    new Product("Running Shoes", 129.99, "Comfortable running shoes", 4.6, "Sportswear", "SportZone", 60, 150),
				    new Product("Backpack", 49.99, "Durable backpack", 4.4, "Accessories", "BagStore", 40, 70));
	
		productRepository.saveAll(products);
		System.out.println("Data seed executed");
		}
	}

}
