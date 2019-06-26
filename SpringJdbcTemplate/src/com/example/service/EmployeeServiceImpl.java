package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;
import com.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeDao empdao;
	@Override
	
	
	public void addemployee(Employee emp) {
		// TODO Auto-generated method stub
       System.out.println(emp);
		
		empdao.addEmployee(emp);
	}

	public void setEmpdao(EmployeeDao empdao) {
		this.empdao = empdao;
	}

	@Override
	public Employee findById(int id1) {
		// TODO Auto-generated method stub
		return empdao.findById(id1);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empdao.getAllEmployees();
	}

	@Override
	public void updateEmployee(String fn1, String ln1, int sal1, int id2) {
		// TODO Auto-generated method stub
		empdao.updateEmployee(fn1, ln1, sal1, id2);
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return empdao.findByName(name);
	}

}
