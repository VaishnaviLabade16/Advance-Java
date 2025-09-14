package com.controller;
import com.service.EmployeeService;

public class EmployeeController 
{
 
	public static void main(String args[])throws Exception
	{
		EmployeeService ss = new EmployeeService();
				ss.insertData();
				ss.updateData();
				ss.getSingleRecord();
				ss.deleteData();
			    ss.getAllRecord();

	}

}