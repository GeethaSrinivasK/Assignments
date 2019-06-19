package com.example.factory;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;
public class MyConnectionFactory {

	
	public static Connection connection;
	
	private static MyConnectionFactory myconnectionfactory;

	private MyConnectionFactory() {
		super();
		
		try {
			Context context=new InitialContext();
			DataSource datasource=(DataSource)context.lookup("java:/comp/env/jdbc/ibm");
			connection=datasource.getConnection();
		}
		catch(Exception e){
			
		}
		
	};
	
	public static MyConnectionFactory getMyConnection()
	{
		if(myconnectionfactory==null)
			myconnectionfactory=new MyConnectionFactory();
		
			return myconnectionfactory;
	}
}
