package com.example.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.*;

public class StudentDaoImpl implements StudentDao {

	private SessionFactory factory;
	private Session session;
	public StudentDaoImpl() {
		super();
		factory=new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(Student.class)
				.buildSessionFactory();
		session=factory.openSession();
	}

	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub

		session.getTransaction().begin();
		session.persist(student);
		session.getTransaction().commit();
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		Query q=session.createQuery("from Student");
		return q.getResultList();
	}

	@Override
	public Student getstudentById(int theId) {
		// TODO Auto-generated method stub
		Student s=session.get(Student.class, new Integer(theId));
		return s;
	}

	@Override
	public List<Student> findByName(String name) {
		// TODO Auto-generated method stub
		Query q=session.createNamedQuery("findByname").setString("fname", name);
		return q.getResultList();
	}

	@Override
	public void updateStudent(Student student1) {
		// TODO Auto-generated method stub
		
	}

}
