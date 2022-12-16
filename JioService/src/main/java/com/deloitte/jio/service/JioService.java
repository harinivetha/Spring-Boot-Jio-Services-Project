package com.deloitte.jio.service;

import java.util.List;

import com.deloitte.jio.entity.Customer;

public interface JioService {

	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	
}
