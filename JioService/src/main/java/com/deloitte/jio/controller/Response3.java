package com.deloitte.jio.controller;

import java.util.List;

import com.deloitte.jio.entity.Customer;
import com.deloitte.jio.model.Recharge;

public class Response3 {

	private Customer customer;
	private List<Recharge> recharge;
	public Response3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response3(Customer customer, List<Recharge> recharge) {
		super();
		this.customer = customer;
		this.recharge = recharge;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Recharge> getRecharge() {
		return recharge;
	}
	public void setRecharge(List<Recharge> recharge) {
		this.recharge = recharge;
	}
	@Override
	public String toString() {
		return "Response3 [customer=" + customer + ", recharge=" + recharge + "]";
	}
	
	
}
