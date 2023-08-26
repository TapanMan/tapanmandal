package com.mandal.nest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NestController {
	@GetMapping("/helloFriends")
	public String sayHello() {
		return "Hello Spring Boot!!";

	}
	
	@GetMapping("/helloWorldFriends")
	public String sayHelloWorld() {
		return "Hello World Spring Boot!!";

	}
}
// Test Conflict one Heee