package com.deloitte.jio.model;

import java.util.List;



import com.deloitte.jio.entity.Customer;



public class Response {
	
	
	private Customer customer;
	private Response2 resp;
	//private List<JioMart> jiom;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Customer customer, Response2 resp) {
		super();
		this.customer = customer;
		this.resp = resp;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Response2 getResp() {
		return resp;
	}
	public void setResp(Response2 resp) {
		this.resp = resp;
	}
	@Override
	public String toString() {
		return "Response [customer=" + customer + ", resp=" + resp + "]";
	}
	
		
}
