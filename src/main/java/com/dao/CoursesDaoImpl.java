package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Entities.Courses;

public class CoursesDaoImpl implements CourseDao {
	
	 private JdbcTemplate jdbcTemplate;

	public CoursesDaoImpl(DataSource dataSource) {
	        this.jdbcTemplate = new JdbcTemplate(dataSource);
	    }

	 @Override
	    public int save(Courses course) {
	        String sql = "INSERT INTO courses (courseTitle, lecturerID) VALUES (?, ?)";
	        return jdbcTemplate.update(sql, course.getCourseTitle(), course.getLecturerID());
	    }



	@Override
	public int delete(int courseID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Courses getCourse(int courseID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Courses> coursesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Courses> getCourseByLecturerId(int lecturerID) {
	    String sql = "SELECT * FROM courses WHERE lecturerID = ?";
	    return jdbcTemplate.query(sql, new Object[]{lecturerID}, (rs, rowNum) -> {
	        Courses course = new Courses();
	        course.setCourseID(rs.getInt("courseID"));
	        course.setCourseTitle(rs.getString("courseTitle"));
	        course.setLecturerID(rs.getInt("lecturerID"));
	        return course;
	    });
	}
	
	
	public List<Courses> getAllCourses() {
	    String sql = "SELECT courses.courseID, courses.courseTitle, lecturer.userName " +
	                 "FROM courses " +
	                 "JOIN lecturer ON courses.lecturerID = lecturer.lecturerID";
	    
	    return jdbcTemplate.query(sql, new RowMapper<Courses>() {
	        public Courses mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Courses course = new Courses();
	            course.setCourseID(rs.getInt("courseID"));
	            course.setCourseTitle(rs.getString("courseTitle"));
	            course.setLecturerName(rs.getString("userName")); // Assuming you have a setter for lecturer's name
	            return course;
	        }
	    });
	}
	
	
	
	public boolean updateCourseTitle(int courseID, String courseTitle) {
	    String sql = "UPDATE courses SET courseTitle = ? WHERE courseID = ?";
	    int rowsAffected = jdbcTemplate.update(sql, courseTitle, courseID);
	    return rowsAffected > 0;
	}


	@Override
	public Courses getCourseById(int courseID) {
	    String sql = "SELECT * FROM courses WHERE courseID = ?";
	    
	    try {
	        return jdbcTemplate.queryForObject(sql, new Object[] { courseID }, (rs, rowNum) -> {
	            Courses course = new Courses();
	            course.setCourseID(rs.getInt("courseID"));
	            course.setCourseTitle(rs.getString("courseTitle"));
	            course.setLecturerID(rs.getInt("lecturerID"));
	            // Set other attributes if needed
	            return course;
	        });
	    } catch (EmptyResultDataAccessException e) {
	        // Handle the case where no course is found
	        return null;
	    }
	}



}
