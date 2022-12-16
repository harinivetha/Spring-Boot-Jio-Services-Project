package com.deloitte.jiomart.controller;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.jiomart.dao.JioMartRepository;
import com.deloitte.jiomart.entity.JioMart;
import com.deloitte.jiomart.model.FailureResponse;
import com.deloitte.jiomart.model.Order;
import com.deloitte.jiomart.model.Response;
import com.deloitte.jiomart.service.JioMartService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/JioMart")
public class JioMartController {
	
	@Autowired
	private JioMartService jservice;
	
	@Autowired
	private RestTemplate rtemp;
	
	@Autowired
	private JioMartRepository jrepo;
	
	
	
	@GetMapping("/get/{id}")
	@HystrixCommand(fallbackMethod="orderFailureFallback")
	public ResponseEntity<Response> getProduct(@PathVariable("id") Integer id)
	{
		JioMart jiom=jrepo.findByCustomerId(id);
		Order ordersList=rtemp.getForObject("http://localhost:8081/orders/getOrder/"+id,Order.class);
		Response response = new Response(jiom,ordersList);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	public ResponseEntity<FailureResponse> orderFailureFallback(@PathVariable("id") Integer id)
	{
		
		JioMart jio=jrepo.findByCustomerId(id);
		FailureResponse response= new FailureResponse(jio,"Currently order service is down");
		return new ResponseEntity<FailureResponse>(response,HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<JioMart>> getProducts()
	{
		List<JioMart> productList=jservice.getProducts();
		return new ResponseEntity<List<JioMart>>(productList,HttpStatus.OK);
	}
 
}
