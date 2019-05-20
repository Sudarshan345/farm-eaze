package com.farmeaze.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmeaze", "root", "Sudarshan@07");
			
		}catch(ClassNotFoundException e){
			System.out.println("where is your mysql driver");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("connection failed check output console");
			e.printStackTrace();
			return null;
		}
		System.out.println("connection returned...............");
		return conn;

	}
}
