package comm.example.springdemo;

import java.util.List;

public interface StudentDao {
	
	
	public void createStudent(Student student);
	
	public List<Student> getAll();

}
