package com.exampleService;

import java.sql.ResultSet;

import com.exampleDAO.CustomerDaoImpl;
import com.exampleModel.Customer;

public class CustomerServiceImpl implements CustomerService{

	 private CustomerDaoImpl cmpl;
	 
	public CustomerServiceImpl() {
		super();
		cmpl=new CustomerDaoImpl();
	}

	public int createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cmpl.createCustomer(customer);
	}

	public ResultSet getCustomers() {
		// TODO Auto-generated method stub
		return cmpl.getAllCustomers();
	}

	public int updateCustomer(int cid, String cname, String citem, String address) {
		// TODO Auto-generated method stub
		return cmpl.updateCustomer(cid,cname,citem,address);
	}

	public int deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		return cmpl.deleteCustomer(cid);
	}

}
