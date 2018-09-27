package com.jdbc.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.dao.DaoImpl;
import com.jdbc.entity.Student;

public class ServiceImpl {
   DaoImpl dao= new DaoImpl();
	public void insertData(String name,int id, float percentage) throws SQLException{
		dao.insert(name, id, percentage);
	}
	
    public void fetchdata() throws SQLException{
    	dao.select();
    }
    
    public ArrayList<Student> fetchdata1() throws SQLException{
    	ArrayList<Student> arr1= new ArrayList<Student>();
    	arr1=dao.select1();
    	return arr1;
    }
    
    public void updateData( float percentage,String name) throws SQLException{
    	dao.update( percentage,name);
    }
    
    public void deleteData(int id) throws SQLException{
    	dao.delete(id);
    }
}
