package com.example.Emp_Detail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Emp_Detail.model.Employee;
import com.example.Emp_Detail.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/Employee")
	public List<Employee> getAllEmployee(){
		List<Employee> employees = employeeService.getAllEmployee();
		return employees;
		}
	@GetMapping("/Employee/search/{name}")
    public Employee getEmployeeByName(@PathVariable String name) {
        Employee employee = employeeService.getEmployeeByName(name);
        System.out.println("Employee fetched by name (" + name + "): " + employee);
        return employee;
    }
	

}
