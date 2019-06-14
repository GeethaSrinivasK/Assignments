package com.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.factory.MyConnectionFactory;
import com.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDAO{

	
	private Connection connection;
	private MyConnectionFactory myConnectionFactory;
	

	@Override
	public int createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int i = 0;
		
		try {
			PreparedStatement pStatement=connection.prepareStatement("insert into employee values(?,?,?,?)");
			
			pStatement.setInt(1, employee.getId());
			pStatement.setString(2, employee.getFirstName());
			
			pStatement.setString(3, employee.getLastName());
			pStatement.setInt(4, employee.getSalary());
			i=pStatement.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}
	

	
	public EmployeeDaoImpl() {
		super();
		
		myConnectionFactory=MyConnectionFactory.getMyConnection();
		
		connection=myConnectionFactory.connection;
		
		
	}



	@Override
	public ResultSet getAllEmployee() {
		// TODO Auto-generated method stub
          ResultSet rs=null;
		
		try {
			PreparedStatement pStatement=connection.prepareStatement("select * from employee");
			
			rs=pStatement.executeQuery();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}



	@Override
	public int deleteEmployeeIn(int eId) {
		// TODO Auto-generated method stub
		
int i = 0;
		
		try {
			PreparedStatement pStatement=connection.prepareStatement("delete from employee where employeeid=?");
			
			pStatement.setInt(1, eId);
			
			i=pStatement.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}



	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
int i = 0;
		
		try {
			PreparedStatement pStatement=connection.prepareStatement("update employee set firstname=?,lastname=?,salary=? where employeeid=?");
			
			
			pStatement.setString(1, employee.getFirstName());
			
			pStatement.setString(2, employee.getLastName());
			pStatement.setInt(3, employee.getSalary());
			pStatement.setInt(4, employee.getId());
			i=pStatement.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

}
