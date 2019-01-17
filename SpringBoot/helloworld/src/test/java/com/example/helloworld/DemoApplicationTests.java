package com.example.helloworld;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class DemoApplicationTests {

	@GetMapping(value="/hello")
	public String getMethodName() {
		return "Hellow Rajesh";
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationTests.class, args);
	}

}

