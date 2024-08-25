package com.Entities;

import java.util.ArrayList;

public class Reservation {

    private int reservationID;
    private int courseID;
    private String courseTitle; // Add this attribute
    private Student student;
    private ArrayList<Courses> courses = new ArrayList<Courses>();

    // Constructors, getters, and setters

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Reservation [reservationID=" + reservationID + ", courseID=" + courseID + ", courseTitle=" + courseTitle + ", student=" + student + ", courses=" + courses + "]";
    }
}
