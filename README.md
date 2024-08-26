# Star-Courses-Project 

## Introduction  

The star courses is a web based application allow the users create student or lecturer account and start reserving courses as a student or create courses as a lecturer .  

In purpose for implementing the CRUD concepts of database operations , this project was developed to show how we can develop a java web based application allowing the user to create new data , update the existed , get data and delete data from the database . 


### CRUD explanation  

The user can sign up as a student or a teacher also the teacher can create new course and the student can reserve a course from the available courses , so all theses operations require inserting data to the database , which is an example for the Creating data operation . 


The user can click on the Courses option as a student so the available courses for reserving are showing and the Lecturer can click on ( My courses ) option so the courses which are created by the signed in lecturer will be presented , so this operation require getting data from the database which is an example for the Reading operation . 


the student can choose to delete a course he has reserved so the data from the database will be deleted from the reservation table and this operation is example for the Delete operation on the database . 

the lecturer can change the course Title so the course Title data will be changed in the database which is an example for the Delete operation . 

_______________________________________________________________________________________________________________________________________________________________________________________

## Technologies used  

### Server-side  

1 . Java  

2 . SpringMVC frame work  

3 . JSP with JSTL  

### Client-side 

1 . HTML  

2 . CSS  

4 . BootStrap 

3 . JavaScript 

4 . JQUERY 


### Server used to test the application  

Apache Tom Cat Server version 9. 

________________________________________________________________________________________________________________________________________________________________________________________

## Images From the Website 

### The main page  

![StarCoursesMain](https://github.com/user-attachments/assets/1d8bd0d3-959c-4807-a567-2bbe70f26bc8) 

  
### Sign up page 

![StarCoursesSignUp](https://github.com/user-attachments/assets/6f6a7d6c-756a-4796-a4a9-959ce896498a) 

  
### Sign in page  

![StarCoursesSignIn](https://github.com/user-attachments/assets/3b34db1c-85f6-4896-83a4-639f20205b4f) 


### Courses List 

![StarCoursesCoursesListPage](https://github.com/user-attachments/assets/3852a968-b4a1-4973-aff7-4c030ba97830) 

### Reserved Courses List 

![StarCoursesReservedCourses](https://github.com/user-attachments/assets/57146f8f-e14f-4293-bd8f-0cbdcc361c73) 

### Lecturer Courses List 

![StarCoursesLecturereCoursesPage](https://github.com/user-attachments/assets/bf01ab63-8409-4133-a4af-27ad70561d3a) 

__________________________________________________________________________________________________________________________________________________________________________________________

## What you need to run the application ? 

### 1. Run the database query in the database Folder which is ( Dump2024826(2).sql ) to create the database with tables schema . 

### 2 . make sure your IDE is presenting the project as dynamic web Model version 2.2 , in eclipse IDE you can change it as the following images are showing . 

click on project properties 

![properites](https://github.com/user-attachments/assets/c96dcd68-f005-4990-a469-132057e5e217) 

choose project facets  

![projectFacets](https://github.com/user-attachments/assets/40ea197c-2547-480c-a5ef-b30d4d8bfc97) 

  

click on Dynamic Web Model and change the version to 2.2 then apply  

![DynamicWeb](https://github.com/user-attachments/assets/415353ec-dfdd-477b-a206-f75ea326f29b) 

  

### Make sure the Maven Dependencies are added to the project structure  

  

click on project properties 

![properites](https://github.com/user-attachments/assets/c96dcd68-f005-4990-a469-132057e5e217) 

  

choose Deployment Assembly  

![Deployment](https://github.com/user-attachments/assets/34cf60a4-9e0a-433a-b6cd-822d7cc98f44) 

  

make sure it exist or click on new and add it  

![image](https://github.com/user-attachments/assets/b7070b45-81ac-4a76-9855-87a119a41136) 

  

### 4 . choose Apache tomcat server version 9 or older to run the project ( You need to download it if you don't have it ) . 

here how you can run it on Apache tom can server  

click on project properties 

![properites](https://github.com/user-attachments/assets/c96dcd68-f005-4990-a469-132057e5e217) 


choose Targetd run time  

![targetdRunTime](https://github.com/user-attachments/assets/a86b08f3-f37f-4bb6-95bc-3738adcc419e) 

  
choose the server you want to run it ( version 9 or older ). 

![servers](https://github.com/user-attachments/assets/25bc5c81-4ce0-4638-867e-783e6e860048) 

  
#### Note : if you don't have any server version you can download it and click on New option and choose the server file location to apply it  



#### Note : this application is using XML servlet file configuration so to connect it with your database make sure to get to testApp-Servlet.xml and add you database password in the correct place and the correct path , you can input your password here <beans:property name="password" value="Your-database-password"/> or make the value empty if your database work without password and here you need to input the database path <beans:property name="url" value="jdbc:mysql://localhost:3306/starcourses"/> . 

__________________________________________________________________________________________________________________________________________________________________________________________
## Improvements the projects need  

this is the first version of the Star courses application and as any software there's always possible enhancements such as . 

### Security enhancements  

the process of course creation requires the teacher to sign in , how ever the teacher needs to input his name to create the course , this issue can lead to cause some security issues because the user can create courses with other Lecturer's Name and create wrong data which effect the data integrity , so we can enhance the security level by avoid inputting the lecturer name in the process of creating new course and take it's value from the session which store the data of the signed in lecturer .  


### Responsive Client-Side design  

the front end design is not responsive so the user can use the application only on desktop screen size and can't use it on other devices such as mobile phone , so we can enhance the project in the future by making the design responsive . 




