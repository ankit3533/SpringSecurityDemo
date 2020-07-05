package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecDemoController {

	@GetMapping("/")
	public String getSecData() {
		return ("<h1>hello</h1>");
	}
	
	@GetMapping("/user")
	public String getSecDataUser() {
		return ("<h1>hello user</h1>");
	}
	
	@GetMapping("/admin")
	public String getSecDataAdmin() {
		return ("<h1>hello Admin</h1>");
	}
	
}
