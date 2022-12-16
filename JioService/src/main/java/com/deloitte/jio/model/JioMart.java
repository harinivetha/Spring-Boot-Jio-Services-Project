package com.deloitte.jio.model;

import jakarta.persistence.Id;

public class JioMart {

	@Id
	private int productId;
	private String productName;
	private String productModel;
	private int customerId;
	public JioMart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JioMart(int productId, String productName, String productModel, int customerId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productModel = productModel;
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductModel() {
		return productModel;
	}
	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "JioMart [productId=" + productId + ", productName=" + productName + ", productModel=" + productModel
				+ ", customerId=" + customerId + "]";
	}
	
	
}
