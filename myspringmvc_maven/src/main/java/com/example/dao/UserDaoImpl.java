package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import myspringmvc_maven.UserDetails;

public class UserDaoImpl implements UserDao {

	
	private JdbcTemplate jdbcTemplate;
	@Override
	public  UserDetails checkUser(UserDetails user) {
		// TODO Auto-generated method stub

		
		try {
		return jdbcTemplate.queryForObject("select * from user where Username=? And password=?", new RowMapper<UserDetails>() {
			
			public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				UserDetails user=new UserDetails();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				return user;
			}
		},user.getUsername(),user.getPassword());
		}
		catch(Exception e) {
		return null;
		}
	}
	public UserDaoImpl() {
		super();
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
