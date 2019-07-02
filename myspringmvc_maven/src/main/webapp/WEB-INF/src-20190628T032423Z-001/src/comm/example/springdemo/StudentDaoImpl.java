package comm.example.springdemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}



public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}



	public StudentDaoImpl() {
	super();
}



	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		String[] temp=student.getOperatingSystems();
		StringBuilder sb=new StringBuilder();
		for(String str:temp)
		{
			sb.append(str);
		}
		 jdbcTemplate.update("insert into student (first_name,last_name,country,favorite_language,operating_systems) values(?,?,?,?,?)",
				student.getFirstName(),student.getLastName(),student.getCountry()
				,student.getFavoriteLanguage(),sb.toString());
	}



	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from student",new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student student=new Student();
				student.setFirstNames(rs.getString("first_name"));
				return student;
			}
		});
	}

}
