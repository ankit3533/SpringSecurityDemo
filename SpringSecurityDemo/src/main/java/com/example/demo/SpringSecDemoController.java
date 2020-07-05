package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecDemoController {

	@GetMapping("/")
	public String getSecData() {
		return "hello";
	}
	
}
