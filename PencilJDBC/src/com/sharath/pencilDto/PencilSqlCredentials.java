package com.sharath.pencilDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PencilSqlCredentials {
	
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/JdbcProjectPractice","root","Sathish@123@");
			return con;
		}
		catch (ClassNotFoundException|SQLException e) {
			// TODO: handle exception
		}
		return null;
		
	}

}
