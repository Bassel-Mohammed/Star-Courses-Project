package com.dao;

import java.util.List;

import com.Entities.Reservation;

public interface ReservationDao {

	
	public boolean reserveCourse(int studentID , int courseID);
	
	
	public List<Reservation> getReservations (int studentID);

	public boolean deleteReservation(int reservationID);
	
	
	
	
}
