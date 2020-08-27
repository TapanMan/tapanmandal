package com.mandal.nest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NestController {
	@GetMapping("/helloFriends")
	public String sayHello() {
		return "Hello Spring Boot!!";

	}
}
