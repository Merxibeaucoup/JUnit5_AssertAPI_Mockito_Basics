package com.edgar.Junit5App;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.edgar.Junit5App.service.Message;

public class TestMessage {
	
	
	
	/* 
	 * Recommended steps to follow 
	 */
	
	

	/* declare variables **/
	private Message m;
	private String expected;
	private String actual;

	/* provide initial data **/
	@BeforeEach
	public void setup() {

		m = new Message();
		expected = "Welcome to: NALA";
		actual = "";

	}

	/* do unit test **/
	@Test
	public void testShowMsg() {

		actual = m.showMsg("NALA");
		assertEquals(expected, actual, "Data may not be matching!");

	}
	
	
	/* clear the memory in heap **/
	@AfterEach
	public void clean() {

		m = null;
		expected = null;
		actual = null;
	}

}
