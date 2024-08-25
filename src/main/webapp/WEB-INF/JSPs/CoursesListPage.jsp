<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courses List</title>






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

       <li> <a href="StudentCoursesPage">My Courses</a> </li>

      </div>


    </div>







<h1>Courses List</h1>

<c:if test="${not empty coursesList}">
   <table class="table" border="1">
    <thead>
        <tr>
            <th>CourseID</th>
            <th>Course Title</th>
            <th>Course Lecturer</th>
            <th>Action</th> <!-- Add a header for the action column -->
        </tr>
    </thead>
    <tbody>
        <c:forEach var="course" items="${coursesList}">
            <tr>
                <td>${course.courseID}</td>
                <td>${course.courseTitle}</td>
                <td>${course.lecturerName}</td>
                <td>
                    <form action="reserveCourse" method="post" style="display:inline;">
                        <input type="hidden" name="courseID" value="${course.courseID}">
                        <button id="button" type="submit">Reserve</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</c:if>

<c:if test="${empty coursesList}">
    <p>There's no courses right now</p>
</c:if>




<script src="resources/main.js" charset="utf-8"></script>

</body>
</html>
