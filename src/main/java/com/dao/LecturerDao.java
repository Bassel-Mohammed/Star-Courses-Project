package com.dao;

import com.Entities.Lecturer;
import java.util.List;

public interface LecturerDao {
	
	public int save(Lecturer lecturer);
	
	public int update(Lecturer lecturer);
	
	public int delete (int lecturerID);
	
	public Lecturer getLecturer(int lecturerID);
	
	public List<Lecturer> lecturerList();

	public boolean getLecturerByUserNameAndPassword(String userName , String password);

	public Lecturer findByUserName(String userName);
	
	

}
