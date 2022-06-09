package com.wipro.niit.SecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "<H1>Welcome to SpringBoot Securiy Module</H1>";
	}

}
