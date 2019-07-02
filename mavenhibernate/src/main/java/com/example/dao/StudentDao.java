package com.example.dao;

import java.util.List;

import com.example.entity.Student;

public interface StudentDao {
	public void createStudent(Student student);
	public List<Student> getStudents();
	public Student getstudentById(int theId);
	public List<Student> findByName(String name);
	public void updateStudent(Student student1);
	public void deleteStudent(Student stu2);
}
