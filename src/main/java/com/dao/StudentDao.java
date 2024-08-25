package com.dao;

import com.Entities.Student;

public interface StudentDao {
	
	public int save(Student student);
	
	public int delete(int studentID);
	
	public int update (Student student);
	
	public Student getStudent(int studentID);

	public boolean getStudentByUserNameAndPassword(String userName, String password);

	public Student findByUserName(String userName);

}
