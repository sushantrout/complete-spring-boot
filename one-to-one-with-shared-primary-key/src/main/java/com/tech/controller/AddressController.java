package com.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Address;
import com.tech.repository.AddressRepository;

@RestController
@RequestMapping(value = "address")
public class AddressController {
	@Autowired
	private AddressRepository addressRepository;
	
	@GetMapping("{id}")
	public Address findById(@PathVariable Long id) {
		return addressRepository.findById(id).orElse(null);
	}
}
