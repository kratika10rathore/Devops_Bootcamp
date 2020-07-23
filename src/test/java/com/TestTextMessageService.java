package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.TextMessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestTextMessageService {
	TextMessageService msg = new TextMessageService();
	
	
	@Test
	public void testMessageEquals() {
	   System.out.println("Hello! Welcome to Devops..");
	   Assertions.assertEquals(msg.sayHello(), "Hello! Welcome to Devops..");
	}
	@Test
	public void testMessageFalse() {
	   
	   Assertions.assertFalse(false, msg.sayHello());
	}
	@Test
	public void testMessageNotEquals() {
	   
	   Assertions.assertNotEquals("hello", msg.sayHello(), "expected and actual strings are different");
	}
	
	@Test
	public void testMessageNotNull() {
	   
	   Assertions.assertNotNull(msg.sayHello(), "string is not null");
	}
	@Test
	public void testMessageNotSame() {
	   
	   Assertions.assertNotSame("Hello world", msg.sayHello(), "expected and actual strings are different");
	}
	
	@Test
	public void testMessage1Equals() {
	   System.out.println("Welcome to World!");
	   Assertions.assertEquals(msg.HelloWorld(), "Welcome to World!");
	}
	@Test
	public void testMessage1False() {
	   
	   Assertions.assertFalse(false, msg.HelloWorld());
	}
	@Test
	public void testMessage1NotEquals() {
	   
	   Assertions.assertNotEquals("hello", msg.HelloWorld(), "expected and actual strings are different");
	}
	
	@Test
	public void testMessage1NotNull() {
	   
	   Assertions.assertNotNull(msg.HelloWorld(), "string is not null");
	}
	@Test
	public void testMessage1NotSame() {
	   
	   Assertions.assertNotSame("Hello world", msg.HelloWorld(), "expected and actual strings are different");
	}
	
	
}
	