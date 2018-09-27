package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jdbc.prop.Config;

public class Utility {
	
	Connection con;
	public Connection openConnection(){
				
		try {
			Config.readProperties();

			Class.forName(Config.driverName);
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/new", Config.username, Config.password);
			
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	public void closeConnection(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
