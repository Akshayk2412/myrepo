package com.project.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	private static Connection connection;

	public static Connection establishConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "akshay123");
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
