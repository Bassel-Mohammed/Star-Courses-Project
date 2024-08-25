package com.Entities;

public class Courses {
    
    private int courseID;
    private String courseTitle;
    private Lecturer lecturer;
    private String lecturerName;

    public Courses() {
    }

    public Courses(int courseID, String courseTitle, Lecturer lecturer) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.lecturer = lecturer;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public int getLecturerID() {
        return lecturer != null ? lecturer.getLecturerID() : 0;
    }

    public void setLecturerID(int lecturerID) {
        if (lecturer == null) {
            lecturer = new Lecturer();
        }
        lecturer.setLecturerID(lecturerID);
    }
    
    public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

    @Override
    public String toString() {
        return "Courses [courseID=" + courseID + ", courseTitle=" + courseTitle + ", lecturer=" + lecturer + "]";
    }

	


}
