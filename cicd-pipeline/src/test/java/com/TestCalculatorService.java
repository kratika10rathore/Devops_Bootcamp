package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.CalculatorService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService {
	CalculatorService calculatorService = new CalculatorService();
    
	@Test
	public void testAdd() {
		
		Assertions.assertEquals(6, calculatorService.add());
		}
	@Test
	public void testNegativeAdd() {
		
		
		Assertions.assertNotEquals(5, calculatorService.add());
		
	}
	@Test
	public void testNullAdd() {
		
		Assertions.assertNotNull(calculatorService.add());		
	}
	@Test
	public void testSub() {
		
		Assertions.assertEquals(2, calculatorService.sub());
		
		
	}
	@Test
	public void testNegativeSub() {
		
		
		Assertions.assertNotEquals(5, calculatorService.sub());
		
	}
	
	@Test
	public void testMultiply() {
		
		Assertions.assertEquals(8, calculatorService.multiply());
				
	}
	@Test
	public void testNegativeMultiply() {
		
		
		Assertions.assertNotEquals(5, calculatorService.multiply());
		
	}
	@Test
	public void testNullMultiply() {
		
		Assertions.assertNotNull(calculatorService.multiply());		
	}
	@Test
	public void testDivide() {
		
		Assertions.assertEquals(2, calculatorService.divide());
				
	}
	@Test
	public void testNegativeDivide() {
		
		
		Assertions.assertNotEquals(5, calculatorService.divide());
		
	}
	
}
