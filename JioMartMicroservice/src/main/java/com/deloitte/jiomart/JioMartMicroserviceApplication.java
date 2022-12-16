package com.deloitte.jiomart;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class JioMartMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JioMartMicroserviceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

}
