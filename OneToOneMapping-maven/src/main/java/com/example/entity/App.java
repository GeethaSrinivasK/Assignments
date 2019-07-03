package com.example.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
					.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
			Session session = factory.openSession();
			session.getTransaction().begin();
			//session.save(new Instructor("John", "Doe", "john@luv2code.com",
					//new InstructorDetail("youtube.com/john", "singing")));
			
			Instructor in=new Instructor();
			in.setFirstName("john");
			in.setLastName("doe");
			in.setEmail("john@luv2code.com");
			InstructorDetail ints=new InstructorDetail();
			ints.setYoutubeChannel("youtube.com/john");
			ints.setHobby("dancing");
			in.setInstructorDetail(ints);
            ints.setInst(in);
            session.save(in);
			session.getTransaction().commit();
			System.out.println("inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
