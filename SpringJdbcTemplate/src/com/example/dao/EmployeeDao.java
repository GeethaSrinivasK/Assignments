package com.example.dao;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeDao {

	public void addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee findById(int id);
	
	public void updateEmployee(String fn,String ln,int salary,int id);
	
	public List<Employee> findByName(String name);
}
