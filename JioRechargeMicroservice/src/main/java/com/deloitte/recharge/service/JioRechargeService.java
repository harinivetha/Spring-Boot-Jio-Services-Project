package com.deloitte.recharge.service;

import java.util.List;

import com.deloitte.recharge.entity.Recharge;



public interface JioRechargeService {

	 Recharge addRecharge(Recharge recharge);
	
	 List<Recharge> getAllRechargePlans();
	
}
