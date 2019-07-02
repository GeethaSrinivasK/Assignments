package com.example.config;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.dao.EmployeeDao;
import com.example.dao.EmployeeDaoImpl;
import com.example.service.EmployeeService;
import com.example.service.EmployeeServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.example")
public class DemoAppConfg {

	@Bean
	public EmployeeDao empdao()
	{
		
		
		
		return new EmployeeDaoImpl(jdbc());
	}
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource dst=new DriverManagerDataSource();
		dst.setDriverClassName("com.mysql.jdbc.Driver");
		dst.setUrl("jdbc:mysql://localhost:3306/geetha");
		dst.setUsername("root");
		dst.setPassword("root");
		return dst;
	}
	
	@Bean
	public JdbcTemplate jdbc()
	
	{
		
		return 	new JdbcTemplate(dataSource());	
	}
	@Bean
	public EmployeeService empservice()
	{
		
		return new EmployeeServiceImpl(empdao());
	}
	 
}
