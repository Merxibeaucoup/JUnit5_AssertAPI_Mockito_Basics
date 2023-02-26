package com.edgar.Junit5App.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConUtil {

	private static Connection con;

	static {

		try {

			Class.forName("org.postgresql.Driver");

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lfg_db", "edgarbriandt", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return con;
	}

}
