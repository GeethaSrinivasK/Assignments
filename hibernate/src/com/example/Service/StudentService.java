package com.example.Service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {

	public void createStudent(Student student);
	public List<Student> getStudents();
	public Student getStudentbyId(int id);
	public List<Student> FindByName(String name);
	public void updateStudent(Student student1);
}
