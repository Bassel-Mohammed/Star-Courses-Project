<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title>Teacher Sign Up</title>

    <!-- bootstrap -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" crossorigin="anonymous"></script>

    <!-- Google fonts links -->
    <link href="https://fonts.googleapis.com/css2?family=Lato&family=Roboto&display=swap" rel="stylesheet">

    <!-- jquery link -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

    <link rel="stylesheet" href="resources/Styles.css">
</head>
<body>

<div class="nav-bar">
      <li class="top-nav-lists" > <img src="images\star.png" alt="" id="logo"> </li>
      <ul class="top-nav-ul" >

        <li class="top-nav-lists" > <a href="main">Home</a></li>
        <li class="top-nav-lists" > <a href="Lecturers">Lecturers</a></li>
        <li class="top-nav-lists" > <a href="about">About</a></li>
      </ul>


      <div id="Regestration-options">

       <li> <a href="LecturerCoursesEdit">Add Courses</a> </li>
        <li> <a href="LecturerCoursesList">My Courses</a> </li>

      </div>


    </div>

<section id="form-section">
    <form:form id="Log-in-form" action="addCourse" method="post" modelAttribute="courseLecturerWrapper">
        <div class="form-group">
            <label for="courseTitle">Course Title</label>
            <form:input path="course.courseTitle" id="courseTitle" class="form-control" type="text" />
        </div>
        <br>
        <div class="form-group">
            <label for="userName">User Name</label>
            <form:input path="lecturer.userName" id="userName" class="form-control" type="text" />
        </div>
        
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</section>

<!-- JavaScript function for password validation -->


<script src="resources/main.js" charset="utf-8"></script>
</body>
</html>
