package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Entities.Reservation;

public class ReservationDaoImpl implements ReservationDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public ReservationDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean reserveCourse(int studentID, int courseID) {
	    String sql = "INSERT INTO reservation (studentID, courseID) VALUES (?, ?)";
	    try {
	        jdbcTemplate.update(sql, studentID, courseID);
	        return true;
	    } catch (DuplicateKeyException e) {
	        // Handle case where the student has already reserved the course
	        return false;
	    } catch (DataAccessException e) {
	        // Handle other potential data access issues
	        return false;
	    }
	}
	
	
	@Override
	public boolean deleteReservation(int reservationID) {
	    String sql = "DELETE FROM reservation WHERE reservationID = ?";

	    try {
	        int rowsAffected = jdbcTemplate.update(sql, reservationID);
	        return rowsAffected > 0;
	    } catch (Exception e) {
	        e.printStackTrace(); // Or use a logging framework
	        return false;
	    }
	}


	@Override
	public List<Reservation> getReservations(int studentID) {
	    String sql = "SELECT r.reservationID, r.courseID, c.courseTitle " +
	                 "FROM reservation r " +
	                 "JOIN courses c ON r.courseID = c.courseID " +
	                 "WHERE r.studentID = ?";
	    
	    try {
	        return jdbcTemplate.query(sql, new Object[] { studentID }, (rs, rowNum) -> {
	            Reservation reservation = new Reservation();
	            reservation.setReservationID(rs.getInt("reservationID"));
	            reservation.setCourseID(rs.getInt("courseID"));
	            reservation.setCourseTitle(rs.getString("courseTitle"));
	            // Set other attributes if needed
	            return reservation;
	        });
	    } catch (Exception e) {
	        // Log the exception
	        e.printStackTrace(); // Or use a logging framework to log the exception
	        return null;
	    }
	}



	



}
















