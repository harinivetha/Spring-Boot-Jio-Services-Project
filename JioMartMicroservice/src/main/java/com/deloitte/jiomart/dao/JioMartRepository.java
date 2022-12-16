package com.deloitte.jiomart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.jiomart.entity.JioMart;

@Repository
public interface JioMartRepository extends JpaRepository<JioMart,Integer>{
	
	public JioMart findByCustomerId(Integer id);

}
