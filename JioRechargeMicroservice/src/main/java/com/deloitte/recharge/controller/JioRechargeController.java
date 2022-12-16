package com.deloitte.recharge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.recharge.entity.Recharge;
import com.deloitte.recharge.repository.JioRechargeRepo;
import com.deloitte.recharge.service.JioRechargeService;

@RestController
@RequestMapping("/JioRecharge")
public class JioRechargeController {
	
	@Autowired
	private JioRechargeService jiorecharge;
	
	@Autowired
	private JioRechargeRepo jiorepo;
	
	@GetMapping("/getAllRechargePlan")
	public ResponseEntity<List<Recharge>> getRechargePlans()
	{
		List<Recharge> rechargeList = jiorecharge.getAllRechargePlans();
		return new ResponseEntity<List<Recharge>>(rechargeList,HttpStatus.OK);
	}
	
    @GetMapping("/getRechargePlans/{id}")
	public ResponseEntity<List<Recharge>> getRechargeById(@PathVariable("id") Integer planId)
	{
		List<Recharge> rechargePlan = jiorepo.findByCustomerId(planId);
		return new ResponseEntity<List<Recharge>>(rechargePlan,HttpStatus.OK);
	}
	
	@PostMapping("/addRecharge")
	public Recharge addRechargePlan(@RequestBody Recharge recharge)
	{
		return jiorecharge.addRecharge(recharge);
	}
	
}
