package com.exampleDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.factory.MyConnectionFactory;
import com.exampleModel.Customer;

public class CustomerDaoImpl implements CustomerDAO{

	private Connection connection;
	private MyConnectionFactory myConnectionFactory;
	public CustomerDaoImpl() {
		super();
		
		myConnectionFactory=MyConnectionFactory.getMyConnection();
		
		connection=myConnectionFactory.connection;
		
		System.out.println(connection);
		
	}
	
	@Override
	public int createCustomer(Customer customer) {
	
		
          int i = 0;
		
		try {
			
			
			PreparedStatement pStatement=connection.prepareStatement("insert into customer1 (customer_name,customer_address,customer_item)values(?,?,?)");
		
			pStatement.setString(1, customer.getcName());
			
			pStatement.setString(2, customer.getcItem());
			pStatement.setString(3, customer.getcAddress());
	
			i=pStatement.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
		
		
	}

	public ResultSet getAllCustomers() {
		// TODO Auto-generated method stub
        ResultSet rs=null;
		
		try {
			
			
			PreparedStatement pStatement=connection.prepareStatement("select * from customer1");
		
			
			rs=pStatement.executeQuery();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}

	public int updateCustomer(int cid, String cname, String citem, String address) {
		// TODO Auto-generated method stub
		 int i = 0;
			
			try {
				
				
				PreparedStatement pStatement=connection.prepareStatement("update customer1 set customer_name=?,customer_address=?,customer_item=? where id=?");
			
				pStatement.setString(1, cname);
				
				pStatement.setString(2, citem);
				pStatement.setString(3, address);
		        pStatement.setInt(4, cid);
				i=pStatement.executeUpdate();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return i;
			
	}

	public int deleteCustomer(int cid) {
		// TODO Auto-generated method stub
	 
		
		 int i = 0;
			
			try {
				
				
				PreparedStatement pStatement=connection.prepareStatement("delete from customer1 where id=?");
			
				
		        pStatement.setInt(1, cid);
				i=pStatement.executeUpdate();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return i;
	}

}
