package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorService {
	
	@GetMapping("/add")
	public int add() {
		return 4+2;
	}
	
	@GetMapping("/sub")
	public int sub() {
		return 4-2;
	}
	
	@GetMapping("/multiply")
	public int multiply() {
		return 4*2;
	}
	
	@GetMapping("/divide")
	public int divide() {
		return 4/2;
	}
}