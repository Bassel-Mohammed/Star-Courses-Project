<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>star Online Courses</title>

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


    <main>


<div id="top-content">


      <h1> <span>Red Star</span>  Courses</h1>
      <h3>Improve your skills by developing real projects solving real life problems</h3>

</div>

<div id="bottom-content">

  <div class="parent">
      <div class="card">
        <img class="card-img" src="images\javaCourse.png" alt="">
        <h4>Java</h4>
        <hr>
        <button type="button" class="btn btn-primary btn-sm"> <a href="#">Discover</a> </button>
      </div>

      <div class="card">
        <img class="card-img" src="images\springCore.png" alt="">
        <h4>Spring core</h4>
        <hr>
        <button type="button" class="btn btn-primary btn-sm"> <a href="#">Discover</a> </button>
        </div>

        <div class="card">
          <img class="card-img" src="images/kotlin.png" alt="">
          <h4>Kotlin</h4>
          <hr>
          <button type="button" class="btn btn-primary btn-sm"> <a href="#">Discover</a> </button>
          </div>

      <div class="card">
        <img class="card-img" src="images\javaScript.png" alt="">
        <h4>Java script</h4>
        <hr>
      <button type="button" class="btn btn-primary btn-sm"> <a href="#">Discover</a> </button>
      </div>

      <div class="card">
        <img class="card-img" src="images\html.png" alt="">
        <h4>HTML</h4>
        <hr>
        <button type="button" class="btn btn-primary btn-sm"> <a href="#">Discover</a> </button>
      </div>

      <div class="card">
        <img class="card-img" src="images\css.png" alt="">
        <h4>CSS</h4>
        <hr>
        <button type="button" class="btn btn-primary btn-sm"> <a href="#">Discover</a> </button>
      </div>

</div>



    </main>



    <footer>

      <p>Copy right &copy;<p>






    </footer>



    <script src="resources/main.js" charset="utf-8"></script>



  </body>
</html>
