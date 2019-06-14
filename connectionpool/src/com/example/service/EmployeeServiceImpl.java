package com.example.service;

import com.example.DAO.EmployeeDAO;
import com.example.DAO.EmployeeDaoImpl;
import com.example.model.Employee;

import java.sql.*;

public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDAO empDao;

	public EmployeeServiceImpl() {
		super();

		empDao = new EmployeeDaoImpl();
	}
	@Override
	public int createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		
			return empDao.createEmployee(emp);
			
		
	}
	public ResultSet getAllEmployees() {
		// TODO Auto-generated method stub
		return empDao.getAllEmployee();
	}
	public int deleteEmployee(int eId) {
		// TODO Auto-generated method stub
		return empDao.deleteEmployeeIn(eId);
	}
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empDao.updateEmployee(employee);
	}

}
