package com.tech.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tbl_employee")
@Data
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "employee_name")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_address",
		joinColumns = { @JoinColumn(referencedColumnName = "id", name = "employee_id") },
		inverseJoinColumns = { @JoinColumn(referencedColumnName = "id", name = "address_id", unique = true) })
	private Address address;

}
