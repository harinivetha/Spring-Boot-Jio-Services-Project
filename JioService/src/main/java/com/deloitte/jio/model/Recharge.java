package com.deloitte.jio.model;

import jakarta.persistence.Id;

public class Recharge {


	@Id
	private int planId;
	private String planName;
	private String validity;
	private String planDataPerDay;
	private String extraPlan;
	private int customerId;
	public Recharge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recharge(int planId, String planName, String validity, String planDataPerDay, String extraPlan,
			int customerId) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.validity = validity;
		this.planDataPerDay = planDataPerDay;
		this.extraPlan = extraPlan;
		this.customerId = customerId;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getPlanDataPerDay() {
		return planDataPerDay;
	}
	public void setPlanDataPerDay(String planDataPerDay) {
		this.planDataPerDay = planDataPerDay;
	}
	public String getExtraPlan() {
		return extraPlan;
	}
	public void setExtraPlan(String extraPlan) {
		this.extraPlan = extraPlan;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	
	
	
}
