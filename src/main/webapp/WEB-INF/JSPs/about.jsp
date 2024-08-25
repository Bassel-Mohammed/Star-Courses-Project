<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>





<!-- bootstrap -->
<link rel="stylesheet" href="	https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>


<!-- Google fonts links -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;0,700;0,900;1,100;1,300;1,400;1,700;1,900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">


<!-- jquery link -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>



<link rel="stylesheet" href="resources/Styles.css">






</head>
<body>






<div class="nav-bar">
      <li class="top-nav-lists" > <img src="images\star.png" alt="" id="logo"> </li>
      <ul class="top-nav-ul" >

        <li class="top-nav-lists" > <a href="main">Home</a></li>
        <li class="top-nav-lists" > <a href="coursesList" id="courses">Courses</a></li>
        <li class="top-nav-lists" > <a href="Lecturers">Lecturers</a></li>
        <li class="top-nav-lists" > <a href="about">About</a></li>
      </ul>


      <div id="Regestration-options">

          <li class="top-nav-lists" > <div class="btn-group">
  <button class="btn btn-secondary btn-sm dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
    Sign in
  </button>
  <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="StudentSignIn">Sign in as a Student</a></li>
    <li><a class="dropdown-item" href="LecturerSignIn">Sign in as a Teacher</a></li>
  </ul>
</div></li>

          <li class="top-nav-lists" >

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





<div id="about">

<h1>about</h1>

<p>This web application is designed to streamline the course management process for lecturers and students within an educational environment. Lecturers can easily create and update course titles, ensuring that their curriculum is always up-to-date. Students benefit from an intuitive interface that allows them to browse available courses, enroll with a single click, and manage their reservations effortlessly. With seamless integration of student and course data, the application fosters a more organized and efficient academic experience, empowering both educators and learners to focus on what matters most: education.</p>



</div>



<script src="resources/main.js" charset="utf-8"></script>

</body>
</html>