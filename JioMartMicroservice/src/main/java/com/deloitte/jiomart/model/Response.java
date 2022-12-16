package com.deloitte.jiomart.model;

import java.util.List;

import com.deloitte.jiomart.entity.JioMart;

public class Response {
	
	private JioMart jiom;
	private Order orderList;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(JioMart jiom, Order orderList) {
		super();
		this.jiom = jiom;
		this.orderList = orderList;
	}
	public JioMart getJiom() {
		return jiom;
	}
	public void setJiom(JioMart jiom) {
		this.jiom = jiom;
	}
	public Order getOrderList() {
		return orderList;
	}
	public void setOrderList(Order orderList) {
		this.orderList = orderList;
	}
	@Override
	public String toString() {
		return "Response [jiom=" + jiom + ", orderList=" + orderList + "]";
	}
	
}
