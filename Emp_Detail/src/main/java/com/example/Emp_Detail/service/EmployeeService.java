package com.example.Emp_Detail.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Emp_Detail.model.Employee;
import com.example.Emp_Detail.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}
	public Employee getEmployeeByName(String name) {
        return employeeRepo.findByName(name).orElse(null);
    }

}
