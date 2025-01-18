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
			String query1 = "select Language as lang from world.countrylanguage;";
			ResultSet rs = statement.executeQuery(query1);	
			while(rs.next()) {
				System.out.println(rs.getString("lang"));
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
