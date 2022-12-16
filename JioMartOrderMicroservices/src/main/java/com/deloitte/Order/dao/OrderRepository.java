package com.deloitte.Order.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.Order.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
	
	 Orders findByCustomerId(Integer customerId);

}
