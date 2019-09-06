package com.virtusa.trainingmanagement.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class OracleHelper 
{
	private static Connection conn;
	private static ResourceBundle rb;
	private OracleHelper()
	{
		
	}
	
	public static Connection getConnection()
	{
		rb=ResourceBundle.getBundle("db");
		String driver=rb.getString("driver");
		String userName=rb.getString("user");
		String password=rb.getString("password");
		String url=rb.getString("url");
		try{
			System.out.println(driver);
			Class.forName(driver);
			conn=DriverManager.getConnection(url, userName, password);
		}
		catch(ClassNotFoundException e){
		  System.out.print(e.getMessage()+"class");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
}
