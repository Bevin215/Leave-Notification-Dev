package com.example.spring_port.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_port.models.Product;

@Repository
public interface productRepository extends JpaRepository<Product,Long> {

}
