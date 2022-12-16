package com.deloitte.jiomart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class Order {
	
	@Id
	private Integer orderId;
	private String orderName;
	private double orderPrice;
	private Integer productId ;
	private Integer customerId;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Integer orderId, String orderName, double orderPrice, Integer productId, Integer customerId) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderPrice = orderPrice;
		this.productId = productId;
		this.customerId = customerId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderPrice=" + orderPrice + ", productId="
				+ productId + ", customerId=" + customerId + "]";
	}
	
	
	
}
