package com.deloitte.recharge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.deloitte.recharge.entity.Recharge;

@Repository
public interface JioRechargeRepo extends JpaRepository<Recharge, Integer> {
	List<Recharge> findByCustomerId(Integer customerId);

}
