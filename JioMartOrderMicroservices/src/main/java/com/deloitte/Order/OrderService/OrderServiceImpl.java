package com.deloitte.Order.OrderService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.Order.dao.OrderRepository;
import com.deloitte.Order.entity.Orders;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderrep;
	
	@Override
	public Orders saveOrder(Orders order) {
	    
		return orderrep.save(order);
	}

	@Override
	public List<Orders> getOrders() {
		
		return orderrep.findAll();
	}



	

}
