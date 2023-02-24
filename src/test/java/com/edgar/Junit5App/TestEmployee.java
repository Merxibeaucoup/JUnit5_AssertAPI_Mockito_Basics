package com.edgar.Junit5App;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

/* A class to test our code **/

@DisplayName("Testing Employee class")
public class TestEmployee {
	

	
	
	/* Utils **/
	
	/* runs only one time before all test methods **/
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("before all \n");
		
	}
	
	/* runs before each test method **/
	@BeforeEach
	public void setup() {
		System.out.println("From SetUp \n");
	}
	
	/* runs after each test method **/
	@AfterEach
	public void clear() {
		
		System.out.println("clear data");	
		
	}
	
	/* runs once after all test method **/
	@AfterAll
	public static void closeALl() {
		System.out.println("\n Once at end");
	}
	
	
	
	/* test methods  **/
	
	@Test
	@DisplayName("Testing Save Method")
	public void testSave() {		
		System.out.println("Hello");
		
	} 
	@Test
	@DisplayName("Testing update Method")
	public void testUpdate() {		
		System.out.println("Hello-Update");
		
	}
	
	@Test
	@DisplayName("Testing delete Method")
	@Disabled
	public void testDelete() {		
		System.out.println("Hello-Delete");
		
	}
	
	
	@RepeatedTest(value =3, name = "{displayName} - {currentRepetition}/{totalRepetitions}")
	@DisplayName("multiple Testss")
	public void testMultiple(TestInfo info) {
		System.out.println("Hello:"+ info.getTestClass().get().getName());
		System.out.println("Hello:"+ info.getTestMethod().get().getName());
		System.out.println("Hello:"+ info.getDisplayName());
	}
	
	
	

	
	
	

}
