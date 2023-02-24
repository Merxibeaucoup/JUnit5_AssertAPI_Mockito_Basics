package com.edgar.Junit5App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class TestEmployee2 {
	
	
	@Test
	@Tag("dev")
	public void testA() {
		
		System.out.println("Hello-TEST-A");
		
		assertEquals("A", "A");
		
	}
	
	
	@Test
	@Tag("prod")
	public void testB() {
		
		System.out.println("Hello-TEST-B");
		
		assertEquals("B", "B");
		
	}

}
