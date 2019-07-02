package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.DemoAppConfg;
import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController



@RequestMapping("/api")
public class EmployeeRestController {

	@Autowired
	EmployeeService empservice;
	List<Employee> employee=null;
	
    
	/*@RequestMapping("/show")
	public List<Employee> initEmployee()
	{
		
		//employee.add(new Employee("geetha","srinivas",30000,new Address("tpt","india")));
	
		//employee.add(new Employee("sravani","M",30000,new Address("nlr","india")));
		//employee.add(new Employee("chandhu","k",40000));
		employee.addAll(li);
		return employee;
		
	}*/
	
	@GetMapping("/employees/{theEmployee}")
	public Employee getEmployee(@PathVariable int theEmployee )
	{
		if((theEmployee>=employee.size()) ||(theEmployee<0)){
			throw new EmployeeNotFoundException("no msuch employee found with id: "+theEmployee);
			
		}
		
		
		return employee.get(theEmployee);
	}
	
	
	@GetMapping("/show")
	public List<Employee> getEmployees()
	{
		employee=new ArrayList<Employee>();
		employee=empservice.getAllEmployees();
		return employee;
	}

	@ExceptionHandler
	public ResponseEntity<EmployeeError> handleException(EmployeeNotFoundException exc)
	{
		EmployeeError error=new EmployeeError();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessge(exc.getMessage());
		error.setTimeOccured(System.currentTimeMillis());
		return new ResponseEntity<EmployeeError>(error,HttpStatus.NOT_FOUND);
	}
	
}
