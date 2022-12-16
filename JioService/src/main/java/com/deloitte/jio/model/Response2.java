package com.deloitte.jio.model;

import java.util.List;




public class Response2 {

	private JioMart jiom;
	private Order orderList;
	public Response2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response2(JioMart jiom, Order orderList) {
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
