package com.deloitte.jio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.jio.entity.Customer;
import com.deloitte.jio.repository.JioRepository;

@Service
public class JioServiceImpl implements JioService{

	@Autowired
	private JioRepository jiorep;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return jiorep.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return jiorep.findAll();
	}

}
