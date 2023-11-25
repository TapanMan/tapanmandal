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
	//The following is only meant for Junit that will return int value
	@GetMapping("/helloWorld")
	public int sayHelloWorldFriends() {
		return 45;
	}
}