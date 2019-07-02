package com.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			SessionFactory factory=new Configuration().
					configure("hibernate.cfg.xml").
					addAnnotatedClass(Student.class)
					.buildSessionFactory();
			Session session=factory.openSession();
			
			session.getTransaction().begin();
			session.save(new Student("geetha","srinivas","gs97@gmail.com"));
			session.getTransaction().commit();
			System.out.println("one row inserted");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
