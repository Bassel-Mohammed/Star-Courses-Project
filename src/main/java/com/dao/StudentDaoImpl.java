package com.dao;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import com.Entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public StudentDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Student student) {
		String sql = "INSERT INTO student (userName, password, email) VALUES (?, ?, ?)";
		return jdbcTemplate.update(sql, student.getUserName(), student.getPassword(), student.getEmail());
	}

	@Override
	public int delete(int studentID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student getStudent(int studentID) {
		// TODO Auto-generated method stub
		return null;
	}

	// Method to check if a student exists with the given username and password
	public boolean getStudentByUserNameAndPassword(String userName, String password) {
		// Corrected SQL query to return a count of rows
		String sql = "SELECT COUNT(*) FROM student WHERE userName = ? AND password = ?";
		Integer count = jdbcTemplate.queryForObject(sql, new Object[] { userName, password }, Integer.class);
		return count != null && count > 0;
	}

	@Override
	public Student findByUserName(String userName) {

		String sql = "SELECT * FROM student WHERE userName = ?";

		try {
			return jdbcTemplate.queryForObject(sql, new Object[] { userName }, (rs, rowNum) -> {
				Student student = new Student();
				student.setStudentID(rs.getInt("studentID"));
				student.setUserName(rs.getString("userName"));
				student.setPassword(rs.getNString("password"));
				student.setEmail(rs.getNString("email"));
				
				return student;
			
			});

		} catch (EmptyResultDataAccessException e) {
			return null;
		}

		
	}
}
























