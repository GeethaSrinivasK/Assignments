package com.example.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeDao empdao()
	{
		
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		emp.setJdbcTemplate(jdbc());
		return emp;
	}
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dst=new DriverManagerDataSource();
		dst.setUrl("jdbc:mysql://localhost:3306/geetha");
		dst.setUsername("root");
		dst.setPassword("root");
		return dst;
	}
	
	@Bean
	public JdbcTemplate jdbc()
	
	{
		JdbcTemplate js=new JdbcTemplate();
		js.setDataSource(dataSource());
		return js;
		
	}
	@Bean
	public EmployeeService empservice()
	{
		EmployeeServiceImpl emps=new EmployeeServiceImpl();
		emps.setEmpdao(empdao());
		return emps;
	}
}
