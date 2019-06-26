package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

	public void addemployee(Employee emp);

	public Employee findById(int id1);

	public List<Employee> getAllEmployees();

	public void updateEmployee(String fn1, String ln1, int sal1, int id2);

	public List<Employee> findByName(String name);
}
