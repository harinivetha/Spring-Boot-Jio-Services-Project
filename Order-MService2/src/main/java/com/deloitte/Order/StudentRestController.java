package com.deloitte.Order;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	BookRestConsumer consumer;
	
	
	   @GetMapping("/data")
		public String getStudentInfo()
		{
			System.out.println();
			return "Accessing from Student Service"+consumer.getBookData();
		}
	   
	   @GetMapping("/allBooks")
	   public String getBooksInfo()
	   {
		   return "Accessing from Student Service"+consumer.getAllBooks();
	   }
	   
	   @GetMapping("/getOneBook/{id}")
	   public String getoneBookById(@PathVariable Integer id)
	   {
		   return "Accessing from Student Service"+consumer.getBookById(id);
	   }
	   
	   @GetMapping("/entitydata")
	   public String getEntityData()
	   {
		   ResponseEntity<String> responseEntity= consumer.getEntityData();
		   return "Accessing from Student Service"+responseEntity.getBody()+"& status is"+responseEntity.getStatusCode();
	   }
	   
}
