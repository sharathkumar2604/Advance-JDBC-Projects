package com.sharath.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset.Concurrency;
import com.sharath.sqlCredentials.SqlCredentials;

public class Dbutils {

	public static Connection get() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			return con;

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println(e);
		}
		return null;
	}
}