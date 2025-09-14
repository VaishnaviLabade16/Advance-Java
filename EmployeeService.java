package com.service;

import com.dao.EmployeeDao;

public class EmployeeService {
	
	public void insertData() throws Exception {
		
		EmployeeDao dao = new EmployeeDao();
		dao.insertData();
	}

	public void updateData() throws Exception {
		
		EmployeeDao dao = new EmployeeDao();
		dao.updateData();
	}
	
	public void deleteData() throws Exception {
		
		EmployeeDao dao = new EmployeeDao();
		dao.deleteData();
	}
	
	public void getSingleRecord() throws Exception {
		
		EmployeeDao dao = new EmployeeDao();
		dao.getSingleRecord();
	}
	
	public void getAllRecord() throws Exception {
		
		EmployeeDao dao = new EmployeeDao();
		dao.getAllRecord();
	}
}