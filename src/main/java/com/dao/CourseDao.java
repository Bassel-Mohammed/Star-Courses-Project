package com.dao;

import java.util.List;

import com.Entities.Courses;

public interface CourseDao {
	
	public int save(Courses course);
	
	
	public int delete (int courseID);
	
	public Courses getCourse(int courseID);
	
	public List<Courses> coursesList();

	public List<Courses> getCourseByLecturerId(int lecturerID);
	
	public List<Courses> getAllCourses();

	boolean updateCourseTitle(int courseID, String courseTitle);


	public Courses getCourseById(int courseID);
}
