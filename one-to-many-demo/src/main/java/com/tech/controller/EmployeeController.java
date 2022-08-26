package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Employee;
import com.tech.service.EmployeeService;


@RestController
@RequestMapping(value = "employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return employeeService.create(employee);
	}
	
	@GetMapping(value = "{id}")
	public Employee findById(@PathVariable Long id) {
		return employeeService.findById(id);
	}
}
