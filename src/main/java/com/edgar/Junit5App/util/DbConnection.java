package com.edgar.Junit5App.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public Connection getConnection() {
		
		Connection con = null;

		try {
			
			Class.forName("org.postgresql.Driver");			
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lfg_db","edgarbriandt","root");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}

}
