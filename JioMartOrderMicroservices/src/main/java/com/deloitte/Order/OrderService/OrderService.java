package com.deloitte.Order.OrderService;

import java.util.List;

import com.deloitte.Order.entity.Orders;

public interface OrderService {

	
	Orders saveOrder(Orders order);
	
	List<Orders> getOrders();
	
	

	
	
}
