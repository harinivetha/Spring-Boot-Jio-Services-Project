package com.deloitte.jio.controller;

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
import org.springframework.web.client.RestTemplate;

import com.deloitte.jio.entity.Customer;
import com.deloitte.jio.model.FailureResponse;
import com.deloitte.jio.model.JioMart;
import com.deloitte.jio.model.Recharge;
import com.deloitte.jio.model.Response;
import com.deloitte.jio.model.Response2;
import com.deloitte.jio.repository.JioRepository;
import com.deloitte.jio.service.JioService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/Jio")
public class JioController {
	
	@Autowired
	private JioService jservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private JioRepository jrep;
	
	
	@GetMapping("/getCustomer/{id}")
	@HystrixCommand(fallbackMethod="orderFailureFallback")
	public ResponseEntity<?> getCustomerId(@PathVariable("id") Integer cid)
	{
		Customer cus=jrep.findByCustomerId(cid);
		Response2 resp=restTemplate.getForObject("http://localhost:8100/JioMart/get/"+cid, Response2.class);
		Response res=new Response(cus,resp);
		return new ResponseEntity<Response>(res,HttpStatus.OK);
		
	}
	
	
	public ResponseEntity<?> orderFailureFallback(@PathVariable("id") Integer id)
	{
		Customer cus=jrep.findByCustomerId(id);
		FailureResponse res=new FailureResponse(cus,"Currently JioMart is down");
		return new ResponseEntity<FailureResponse>(res,HttpStatus.OK);
		
	}
	
	@GetMapping("/getRecharge/{id}")
	public ResponseEntity<?> getRechargeId(@PathVariable("id") Integer cid)
	{
		Customer cus=jrep.findByCustomerId(cid);
		List<Recharge> resp1=restTemplate.getForObject("http://localhost:8086/JioRecharge/getRechargePlans/"+cid, List.class);
		Response3 res2=new Response3(cus,resp1);
		return new ResponseEntity<Response3>(res2,HttpStatus.OK);
		
	}
	
	
	
	
	@GetMapping("/getCustomerByName/{name}")
	public ResponseEntity<Customer> getCustomerByName(@PathVariable("name") String customername)
	{
		Customer orderList = jrep.findByCustomerName(customername);
		return new ResponseEntity<Customer>(orderList,HttpStatus.OK);
	}
	
	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		List<Customer> orderList = jservice.getAllCustomer();
		return new ResponseEntity<List<Customer>>(orderList,HttpStatus.OK);
	}
	
	@PostMapping("/addCustomer")
	public Customer save(@RequestBody Customer customer)
	{
		 
		return jservice.addCustomer(customer);
	}


}
