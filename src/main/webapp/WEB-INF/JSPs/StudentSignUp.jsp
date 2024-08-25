<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title>Student Sign Up</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>

    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;0,700;0,900;1,100;1,300;1,400;1,700;1,900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">

    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

    <!-- Custom Styles -->
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
    <form:form id="Log-in-form" action="studentSign" method="post" modelAttribute="student" onsubmit="return validatePassword();">
        <div class="login-title">
            <h1>Sign Up</h1>
        </div>

        <div class="mb-3">
            <form:label path="userName" class="form-label">User Name</form:label>
            <form:input path="userName" class="form-control" id="userName" />
        </div>

        <div class="mb-3">
            <form:label path="email" class="form-label">Email</form:label>
            <form:input path="email" class="form-control" id="email" />
        </div>

        <div class="mb-3">
            <form:label path="password" class="form-label">Password</form:label>
            <form:password path="password" class="form-control" id="password" />
        </div>
        
         <div class="mb-3">
            <label for="confirmPassword" class="form-label">Re-enter Password</label>
            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" />
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</section>

<script src="resources/main.js" charset="utf-8"></script>
</body>
</html>
