package com.example.Emp_Detail.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Emp_Detail.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	Optional<Employee> findByName(String name);
}
