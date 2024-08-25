package com.Entities;

import java.util.ArrayList;

public class Student {
	
	
	
	private int studentID;
	private String userName;
	private String password;
	private String email;
	
	private ArrayList<Reservation> reservations = new ArrayList<>();
	
	
	

	public Student() {
		
	}
	
	public Student (String userName , String password , String email) {
		this.userName = userName;
		this.password = password;
		this.email = email;
		
	}
	
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(ArrayList<Reservation> reservations) {
		this.reservations = reservations;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", userName=" + userName + ", password=" + password + ", email="
				+ email + "]";
	}
	
	

}
