package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextMessageService {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
}