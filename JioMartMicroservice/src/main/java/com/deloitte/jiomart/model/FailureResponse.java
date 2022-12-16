package com.deloitte.jiomart.model;

import com.deloitte.jiomart.entity.JioMart;

public class FailureResponse {

	private JioMart jmart;
	private String msg;
	public FailureResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponse(JioMart jmart, String msg) {
		super();
		this.jmart = jmart;
		this.msg = msg;
	}
	public JioMart getJmart() {
		return jmart;
	}
	public void setJmart(JioMart jmart) {
		this.jmart = jmart;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
