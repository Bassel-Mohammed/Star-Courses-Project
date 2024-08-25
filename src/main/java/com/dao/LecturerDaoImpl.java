package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Entities.Lecturer;

public class LecturerDaoImpl implements LecturerDao {
	
	
	private JdbcTemplate jdbcTemplate ;
	
	 public LecturerDaoImpl(DataSource dataSource) {
	        this.jdbcTemplate = new JdbcTemplate(dataSource);
	    }
	

	@Override
	public int save(Lecturer lecturer) {
		String sql = "INSERT INTO lecturer (userName , password , email) VALUES(? , ? , ?)";
		return jdbcTemplate.update(sql , lecturer.getUserName() , lecturer.getPassword() , lecturer.getEmail());
	}
	
	public boolean getLecturerByUserNameAndPassword(String userName , String password) {
		
		String sql = "SELECT COUNT(*) FROM lecturer WHERE userName = ? AND password =?";
		Integer count = jdbcTemplate.queryForObject(sql , new Object[] {userName , password} ,Integer.class);
		return count != null && count >0;
	}
	
	
	

	@Override
	public int update(Lecturer lecturer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int lecturerID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Lecturer getLecturer(int lecturerID) {
	    String sql = "SELECT * FROM lecturer WHERE lecturerID = ?";

	    try {
	        return jdbcTemplate.queryForObject(sql, new Object[]{lecturerID}, (rs, rowNum) -> {
	            Lecturer lecturer = new Lecturer();
	            lecturer.setLecturerID(rs.getInt("lecturerID"));
	            lecturer.setUserName(rs.getString("userName"));
	            lecturer.setPassword(rs.getString("password"));
	            lecturer.setEmail(rs.getString("email"));
	            return lecturer;
	        });
	    } catch (EmptyResultDataAccessException e) {
	        return null; // Return null if no lecturer is found with the provided ID
	    }
	}


	@Override
	public List<Lecturer> lecturerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lecturer findByUserName(String userName) {
String sql = "SELECT * FROM lecturer WHERE userName = ?";
	    
	    try {
	        return jdbcTemplate.queryForObject(sql, new Object[]{userName}, (rs, rowNum) -> {
	            Lecturer lecturer = new Lecturer();
	            lecturer.setLecturerID(rs.getInt("lecturerID"));
	            lecturer.setUserName(rs.getString("userName"));
	            lecturer.setPassword(rs.getString("password"));
	            lecturer.setEmail(rs.getString("email"));
	            return lecturer;
	        });
	    } catch (EmptyResultDataAccessException e) {
	        return null; // Return null if no lecturer is found with the provided userName
	    }
	}

	}



