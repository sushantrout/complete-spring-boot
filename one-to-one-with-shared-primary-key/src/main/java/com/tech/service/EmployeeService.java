package com.tech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.entity.Address;
import com.tech.entity.Employee;
import com.tech.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee create(Employee employee) {
		Address address = employee.getAddress();
		address.setEmployee(employee);
		Employee save = employeeRepository.save(employee);
		return save;
	}

	public Employee findById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

}
