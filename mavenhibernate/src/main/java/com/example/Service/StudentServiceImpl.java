package com.example.Service;

import java.util.List;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.entity.Student;

public class StudentServiceImpl implements StudentService {

 private  StudentDao stdao;
	public StudentServiceImpl() {
	super();
	stdao=new StudentDaoImpl();
}

	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
     stdao.createStudent(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return stdao.getStudents();
	}

	@Override
	public Student getStudentbyId(int id) {
		// TODO Auto-generated method stub
		return stdao.getstudentById(id);
	}

	@Override
	public List<Student> FindByName(String name) {
		// TODO Auto-generated method stub
		return stdao.findByName(name);
	}

	@Override
	public void updateStudent(Student student1) {
		// TODO Auto-generated method stub
		stdao.updateStudent(student1);
	}

	@Override
	public void deleteStudent(Student stu2) {
		// TODO Auto-generated method stub
		stdao.deleteStudent(stu2);
	}

}
