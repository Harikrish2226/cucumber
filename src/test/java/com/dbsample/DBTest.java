package com.dbsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "root");
			System.out.println("Connected");
			
			Statement statement = con.createStatement();
			String query1 = "select * from  hari.login_credential;";
			//String query1 = "insert into hari.login_credential (name, username, password) values('jagadish', 'jaga2', 'j@2154');";
		
			ResultSet rs = statement.executeQuery(query1);
			
			
			//statement.execute(query1);
			
	
			
			
			while(rs.next()) { 
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("username"));
				}
			 		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
