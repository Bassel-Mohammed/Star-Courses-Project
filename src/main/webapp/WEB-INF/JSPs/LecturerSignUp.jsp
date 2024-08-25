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
    <li class="top-nav-lists">
       <li class="top-nav-lists" > <img src="images\star.png" alt="" id="logo"> </li>
    </li>
    <ul class="top-nav-ul">
        <li class="top-nav-lists"><a href="main">Home</a></li>
        <li class="top-nav-lists" > <a href="coursesList" id="courses">Courses</a></li>
        <li class="top-nav-lists"><a href="Lecturers">Lecturers</a></li>
        <li class="top-nav-lists"><a href="about">About</a></li>
    </ul>

    <div id="Regestration-options">
        <li class="top-nav-lists">
            <div class="btn-group">
                <button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Sign in
                </button>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="StudentSignIn">Sign in as a Student</a></li>
                    <li><a class="dropdown-item" href="LecturerSignIn">Sign in as a Teacher</a></li>
                </ul>
            </div>
        </li>

        <li class="top-nav-lists">
            <div class="btn-group">
                <button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Sign Up
                </button>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="StudentSignUp">Sign up as a Student</a></li>
                    <li><a class="dropdown-item" href="LecturerSignUp">Sign Up as a Teacher</a></li>
                </ul>
            </div>
        </li>
    </div>
</div>

<section id="form-section">
    <form:form id="Log-in-form" action="lecturerSign" method="post" modelAttribute="lecturer" onsubmit="return validatePassword();">
        <div class="login-title">
            <h1>Sign Up</h1>
        </div>

        <div class="mb-3">
            <form:label path="userName" for="exampleInputEmail1" class="form-label">User Name</form:label>
            <form:input path="userName" type="text" class="form-control" id="exampleInputEmail1" />
        </div>

        <div class="mb-3">
            <form:label path="email" for="exampleInputEmail1" class="form-label">Email</form:label>
            <form:input path="email" type="email" class="form-control" id="exampleInputEmail1" />
        </div>

        <div class="mb-3">
            <form:label path="password" for="password" class="form-label">Password</form:label>
            <form:input path="password" type="password" class="form-control" id="password" />
        </div>
        
        <div class="mb-3">
            <label for="confirmPassword" class="form-label">Re-enter Password</label>
            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" />
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</section>

<!-- JavaScript function for password validation -->


<script src="resources/main.js" charset="utf-8"></script>
</body>
</html>
