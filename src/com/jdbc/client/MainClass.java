package com.jdbc.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import com.jdbc.entity.Student;
import com.jdbc.service.ServiceImpl;

public class MainClass {

	public static void main(String[] args) throws SQLException {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter your choice:");
	 System.out.println("1. Insert 2.fetch 3.update 4.delete");
	 int choice= sc.nextInt();
	 ServiceImpl serv= new ServiceImpl();
	 switch(choice){
	 case 1:
		
		 for(int i=0;i<5;i++){
	     Student st= new Student();
		 System.out.println("enter name");
		 String name=sc.next();
		 st.setName(name);
		 System.out.println("enter id");
		 int id=sc.nextInt();
		 st.setId(id);
		 System.out.println("enter percentage");
		 float percentage= sc.nextFloat();
		 st.setPercentage(percentage);
		 serv.insertData(name, id, percentage);
		 System.out.println("record inserted");
		 }
		 break;
		 
		 case 2:
			serv.fetchdata();
			ArrayList<Student> arr2= new ArrayList<Student>();
			arr2=serv.fetchdata1();
			for(Student s1:arr2){
				System.out.println(s1.getName() + " " + s1.getId() + " " + s1.getPercentage());
			}
			
			break;
			
		 case 3:
			 System.out.println("enter the number of studnts whose data is to be updated");
			 int num= sc.nextInt();
			 for(int i=0;i<num;i++){
				 Student st= new Student();
				System.out.println("enter name");
				String name= sc.next();
				st.setName(name);
				System.out.println("enter percentage");
				float percentage=sc.nextFloat();
				st.setPercentage(percentage);
				serv.updateData( percentage,name);
				System.out.println("records updated");
				
			 }
			 
			 break;
			 
		 case 4:
			 System.out.println("enter number of students whose data is to be deleted");
			 int num1=sc.nextInt();
			 for(int i=0;i<num1;i++){
				 Student st= new Student();
				 System.out.println("enter id");
				 int id= sc.nextInt();
				 st.setId(id);
				 serv.deleteData(id);
				 System.out.println("deleted successfully");
				 
			 }
			 
		 }
	 
	 
	
	}

}


