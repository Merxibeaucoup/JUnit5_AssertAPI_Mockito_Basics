package com.edgar.Junit5App;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.edgar.Junit5App.util.DbConUtil;

public class TestDbConUtil {
	
	
	
	@Test
	public void testGetConnection() {
		
		Connection con1 = DbConUtil.getConnection();
		Connection con2 = DbConUtil.getConnection();
		
		
//		assertNotNull(con1, "Connection not created");
		
		if(con1 == null || con2 == null ) {
			
			/*Test case fail **/ 
			fail("Connections are not created");
		}
		assertSame(con1, con2, "May not be same connection");
		
	}

}
