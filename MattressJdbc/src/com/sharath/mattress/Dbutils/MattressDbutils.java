package com.sharath.mattress.Dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MattressDbutils {

	public static Connection getConnection()
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_project", "root","Sathish@123@");
			return con;
		}
		catch (SQLException|ClassNotFoundException e) {
		}
		return null;
	}
	
	
}
