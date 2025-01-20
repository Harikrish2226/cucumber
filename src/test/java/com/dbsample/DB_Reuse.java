package com.dbsample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class DB_Reuse {

	
public static Connection get_Connection() {
	Connection con = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "root");
		System.out.println("Connected");
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return con;
}

public static ResultSet queryRead(String query)  {
	ResultSet rs = null;
	try {
		
		Statement statement = get_Connection().createStatement();
		 rs = statement.executeQuery(query);	
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return rs;	
}

//update -> update and insert
		public static void update_DBdata(String query) {
			
			try {
				Statement statement = get_Connection().createStatement();
				statement.execute(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
}
