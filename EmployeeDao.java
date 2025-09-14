//package com.Dao;
package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.*;
import java.util.*;

public class EmployeeDao{
	public void insertData() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Vaishu@16");
	//System.out.println(c);
	Statement s = c.createStatement();
	int a = s.executeUpdate("insert into employee(id,name,age,city)values(1,'rani',23,'pune'),(2,'rutuja',22,'latur'),(3,'kalyani',21,'indore'),(4,'nandini',22,'dhule'),(5,'vaishnavi',20,'pune')");

	if(a > 0) {
		
		System.out.println("Data is inserted..");
	}
	else {
		System.out.println("Data is Not inserted..");
	}

	c.close();
	}
 
	public void updateData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Vaishu@16");
		Statement s = c.createStatement();
		int b = s.executeUpdate("update employee set name='prachi' where name ='rani';");
		
		if(b > 0) {
			System.out.println("Data is Updated..");
		}
		else {
			System.out.println("Data is Not Updated..");
		}
		c.close();	
		
	}

	public void deleteData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Vaishu@16");
		Statement s = c.createStatement();
		int a = s.executeUpdate("delete From employee Where id = 1;");
		
		if(a > 0) {
			
			System.out.println("id is succesfully deleted..");
		}
		else {
			System.out.println("id is Not deleted..");
		}
		c.close();	
		
	}
	
	public void getSingleRecord() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Vaishu@16");
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select * from employee where id = 5;");
		
		if(r.next()) {
			System.out.println("Query is Executed..");
		}
		else {
			System.out.println("Query is Not Executed..");
		}
		c.close();
	}
	
	public void getAllRecord() throws Exception 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Vaishu@16");
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select * from employee;");
		
		if(r.next()) {
			System.out.println("Get Records Sucessfully..");
		}
		else {
			System.out.println("Please Try Again..");
		}
	}
}
