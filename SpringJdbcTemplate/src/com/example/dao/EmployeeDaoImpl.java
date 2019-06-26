package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public EmployeeDaoImpl() {
		super();
	}
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update("insert into employee values(?,?,?,?)",employee.getEmpId(),employee.getEmpfirstName(),employee.getEmpLastname(),employee.getSalary());
		
		
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		

		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
			
			
			public Employee mapRow(ResultSet rs,int rownum)throws SQLException{
				
				Employee employee=new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpfirstName(rs.getString(2));
				employee.setEmpLastname(rs.getString(3));
                employee.setSalary(rs.getInt(4));				
				
				return employee;
			}
			
		});
		
	}
	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
         return jdbcTemplate.queryForObject("select * from employee where employeeid=?", new RowMapper<Employee>() {
			
			
			public Employee mapRow(ResultSet rs,int rownum)throws SQLException{
				
				Employee employee=new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpfirstName(rs.getString(2));
				employee.setEmpLastname(rs.getString(3));
                employee.setSalary(rs.getInt(4));				
				
				return employee;
			}
			
		},id);
	}
	@Override
	public void updateEmployee(String fn, String ln, int salary,int id) {
		// TODO Auto-generated method stub
	jdbcTemplate.update("update  employee set firstname=?,lastname=?,salary=? where employeeid=?",fn,ln,salary,id);
	}
	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
return jdbcTemplate.query("select * from employee where firstname=?", new RowMapper<Employee>() {
			
			
			public Employee mapRow(ResultSet rs,int rownum)throws SQLException{
				
				Employee employee=new Employee();
				employee.setEmpId(rs.getInt(1));
				employee.setEmpfirstName(rs.getString(2));
				employee.setEmpLastname(rs.getString(3));
                employee.setSalary(rs.getInt(4));				
				
				return employee;
			}
			
		},name);
	}

}
