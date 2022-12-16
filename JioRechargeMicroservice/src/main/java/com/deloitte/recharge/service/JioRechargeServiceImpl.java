package com.deloitte.recharge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.deloitte.recharge.entity.Recharge;
import com.deloitte.recharge.repository.JioRechargeRepo;

@Service
public class JioRechargeServiceImpl implements JioRechargeService{

	@Autowired
	private JioRechargeRepo jrepo;
	
	@Override
	public Recharge addRecharge(Recharge recharge) {
		
		return jrepo.save(recharge);
	}

	@Override
	public List<Recharge> getAllRechargePlans() {
		
		return jrepo.findAll();
	}

}

