package com.edgar.Junit5App;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.edgar.Junit5App.util.DbConnection;

public class TestDbConnection {
	
	
	
	
	private DbConnection dbc;
	private Connection con;
	
	
	@BeforeEach
	public void setUp() {
		dbc = new DbConnection();
	}
	
	
	
	@Test
	public void testGetConnection() {
		
		
		assertDoesNotThrow(()-> {
			con = dbc.getConnection();	
		});
		
		/* Expected value is not null**/
		assertNotNull(con, "Connection is not created, please check!");		
	}
	
	
	@AfterEach
	public void cleanUp() {
		dbc = null;
		con =null;
	}

}
