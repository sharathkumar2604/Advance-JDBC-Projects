package com.sharath.mobile.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sharath.mobile.sqlCredentials.SqlCredentials;

public class MobileUtils {

	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(SqlCredentials.URL.getValue(),SqlCredentials.USERNAME.getValue(),SqlCredentials.PASSWORD.getValue());
			return con;
		}
		catch (ClassNotFoundException|SQLException e) {

			System.out.println(e.getMessage());
		}
		return null;
	}
}
