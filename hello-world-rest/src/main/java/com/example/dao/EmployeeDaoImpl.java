package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	
	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	public EmployeeDaoImpl() {
		super();
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
			
			
			public Employee mapRow(ResultSet rs,int rownum)throws SQLException{
				
				Employee employee=new Employee();
				//employee.setEmpId(rs.getInt(1));
				employee.setFirstname(rs.getString(2));
				employee.setLastname(rs.getString(3));
                employee.setSalary(rs.getInt(4));				
				
				return employee;
			}
			
		});
	}

}
