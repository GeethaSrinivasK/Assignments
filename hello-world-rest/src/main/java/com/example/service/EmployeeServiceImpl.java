package com.example.service;

import java.util.List;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeDao empdao;
	
	
	public EmployeeServiceImpl(EmployeeDao empdao) {
		super();
		this.empdao = empdao;
	}
	public EmployeeServiceImpl() {
		super();
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empdao.getAllEmployees();
	}

	
}
