package com.deloitte.jio.model;

import com.deloitte.jio.entity.Customer;

public class FailureResponse {

	private Customer customer;
	private String msg;
	public FailureResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponse(Customer customer, String msg) {
		super();
		this.customer = customer;
		this.msg = msg;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
