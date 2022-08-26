package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Employee;
import com.tech.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee findById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

}
