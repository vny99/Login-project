package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection connect;
	public static Connection getConnect() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/model", "root","Sopra@2022");
			return connect;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return null;
	}

}
