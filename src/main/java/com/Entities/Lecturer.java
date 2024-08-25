package com.Entities;

import java.util.ArrayList;

public class Lecturer {

	private int lecturerID;
	private String userName;
	private String email;
	private String password;
	
	private ArrayList<Courses> courses = new ArrayList<Courses>();

	

	public Lecturer() {

	}

	public Lecturer(String userName , String email , String password) {
		
		this.userName = userName;
		this.email = email;
		this.password =password;
	}
	
	public ArrayList<Courses> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Courses> courses) {
		this.courses = courses;
	}

	public int getLecturerID() {
		return lecturerID;
	}

	public void setLecturerID(int lecturerID) {
		this.lecturerID = lecturerID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Lecturer [lecturerID=" + lecturerID + ", userName=" + userName + ", email=" + email + ", password="
				+ password + ", getLecturerID()=" + getLecturerID() + ", getUserName()=" + getUserName()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
