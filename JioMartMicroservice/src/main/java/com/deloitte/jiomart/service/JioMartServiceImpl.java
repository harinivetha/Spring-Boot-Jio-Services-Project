package com.deloitte.jiomart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.jiomart.dao.JioMartRepository;
import com.deloitte.jiomart.entity.JioMart;

@Service
public class JioMartServiceImpl implements JioMartService{

	@Autowired
	private JioMartRepository jrep;
	
	
	@Override
	public List<JioMart> getProducts() {
		
		return jrep.findAll();
	}

}
