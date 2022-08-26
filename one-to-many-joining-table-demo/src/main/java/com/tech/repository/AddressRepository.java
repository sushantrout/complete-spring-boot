package com.tech.repository;

import org.springframework.data.repository.CrudRepository;

import com.tech.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Long>{

}
