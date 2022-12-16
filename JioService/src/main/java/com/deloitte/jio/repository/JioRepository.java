package com.deloitte.jio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.jio.entity.Customer;

public interface JioRepository extends JpaRepository<Customer, Integer>{

	public Customer findByCustomerId(Integer customerId);
	
	public Customer findByCustomerName(String customerName);
	
}
