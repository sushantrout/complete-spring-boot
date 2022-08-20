package com.tech.repository;

import org.springframework.data.repository.CrudRepository;

import com.tech.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
