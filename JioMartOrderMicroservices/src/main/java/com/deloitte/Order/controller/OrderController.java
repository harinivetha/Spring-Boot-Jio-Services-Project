package com.deloitte.Order.controller;

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

import com.deloitte.Order.OrderService.OrderService;
import com.deloitte.Order.OrderService.OrderServiceImpl;
import com.deloitte.Order.dao.OrderRepository;
import com.deloitte.Order.entity.Orders;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	
	
	@Autowired
	private OrderService oservice;
	
	@Autowired
	private OrderRepository orepo;
	
    @GetMapping("/getOrders")
	public ResponseEntity<List<Orders>> getOrders()
	{
		List<Orders> orderList = oservice.getOrders();
		return new ResponseEntity<List<Orders>>(orderList,HttpStatus.OK);
	}
	
    @GetMapping("/getOrder/{id}")
	public ResponseEntity<Orders> getOrderById(@PathVariable("id") Integer customerId)
	{
		Orders orderList = orepo.findByCustomerId(customerId);
		return new ResponseEntity<Orders>(orderList,HttpStatus.OK);
	}
	
	@PostMapping("/addOrder")
	public Orders saveOrder(@RequestBody Orders order)
	{
		return oservice.saveOrder(order);
	}
	
	
 }
