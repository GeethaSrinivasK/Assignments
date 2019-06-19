package com.exampleDAO;

import java.sql.ResultSet;

import com.exampleModel.Customer;

public interface CustomerDAO {

	public int createCustomer(Customer customer);
	public ResultSet getAllCustomers();
	public int updateCustomer(int cid, String cname, String citem, String address);
	public int deleteCustomer(int cid);
}
