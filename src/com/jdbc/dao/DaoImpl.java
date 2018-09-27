package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jdbc.entity.Student;
import com.jdbc.util.Utility;

public class DaoImpl {
	 Utility util= new Utility();
	 Connection con;
	
	public void insert(String name, int id, float percentage) throws SQLException{
		con=util.openConnection();
		PreparedStatement ps;
		String query= "insert into students_data values(?,?,?)";
		ps= con.prepareStatement(query);
		ps.setString(1, name);
		ps.setInt(2, id);
		ps.setFloat(3, percentage);
		ps.executeUpdate();
		
		
	}
	
	public void select() throws SQLException{
		con=util.openConnection();
		String query="select * from students_data";
		Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		while(rs.next()){
			System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " +  rs.getFloat(3));
		}
	}
	
	public ArrayList<Student> select1() throws SQLException{
		con=util.openConnection();
		ArrayList<Student> arr= new ArrayList<Student>();
		String query="select * from students_data";
		Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		while(rs.next()){
			Student s= new Student(rs.getString(1), rs.getInt(2), rs.getFloat(3));
			arr.add(s);
			}
		return arr;
		
		
		
	}
	
	public void update(float percentage,String name) throws SQLException{
		con=util.openConnection();
		String query="update students_data set perentage=? where name=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setFloat(1, percentage);
		ps.setString(2, name);
		ps.executeUpdate();
		
	}
	public void delete(int id) throws SQLException{
		con=util.openConnection();
		String query="delete from students_data where id=?";
		PreparedStatement ps= con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
		
		
	}

}
