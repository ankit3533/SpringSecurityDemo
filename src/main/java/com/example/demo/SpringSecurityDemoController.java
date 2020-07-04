package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityDemoController {

	@GetMapping
	public String getGreeting() {
		return "Hello";
	}
	
}
