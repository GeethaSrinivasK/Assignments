package com.exampleService;

import java.sql.ResultSet;

import com.exampleModel.Customer;

public interface CustomerService {

	public int createCustomer(Customer customer);
	public ResultSet getCustomers();
	public int updateCustomer(int cid, String cname, String citem, String address);
	public int deleteCustomer(int cid);
}
