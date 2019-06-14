package com.example.DAO;

import java.sql.ResultSet;

import com.example.model.Employee;

public interface EmployeeDAO {

	public int createEmployee(Employee emp);

	public ResultSet getAllEmployee();

	public int deleteEmployeeIn(int eId);

	public int updateEmployee(Employee employee);
}
