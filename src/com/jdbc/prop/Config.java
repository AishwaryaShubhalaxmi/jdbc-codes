package com.jdbc.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
	public static String driverName= null;
	public static String username=null;
    public static String password= null;
	public static void readProperties(){
		Properties p= new Properties();
		InputStream input= null;
	 	
		try {
			input= new FileInputStream("D:\\jmetersummaryreport\\propjdbc.properties");
			p.load(input);
			driverName=p.getProperty("driverName");
			username=p.getProperty("username");
			password=p.getProperty("password");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
