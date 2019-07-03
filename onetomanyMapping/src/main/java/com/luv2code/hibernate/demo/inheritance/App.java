package com.luv2code.hibernate.demo.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			
			SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Car.class)
					.addAnnotatedClass(Manual.class)
					.buildSessionFactory();
                Session session = factory.openSession();
                session.getTransaction().begin();
                Manual c1=new Manual();
                c1.setCarColor("gray");
                c1.setMakeYear("2019");
                c1.setIsAutomatic("false");
                session.save(c1);
                session.getTransaction().commit();
                System.out.println("done!!");
                
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

}
