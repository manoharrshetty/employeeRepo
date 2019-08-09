package com.emp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		Employee emp = restTemplate.getForObject("http://localhost:8080/employee?id=1", Employee.class);
		

	
		log.info(emp.toString());
		
		
	
		
		
			
		
	}
}