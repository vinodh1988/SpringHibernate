package com.model.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			//Loading the driver class into memory
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establishing Connection
			Connection connection=DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
			
			//creating a Statement
			Statement statement=connection.createStatement();
			//Executing SQL Statement
			statement.executeUpdate
			("insert into firsttab values(1,'Naveen')");
			
			System.out.println("Row Created");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
