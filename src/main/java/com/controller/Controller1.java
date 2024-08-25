package com.controller;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.Entities.CourseLecturerWrapper;
import com.Entities.Courses;
import com.Entities.Lecturer;
import com.Entities.Reservation;
import com.Entities.Student;
import com.dao.CourseDao;
import com.dao.CoursesDaoImpl;
import com.dao.LecturerDao;
import com.dao.ReservationDao;
import com.dao.StudentDao;

@Controller
public class Controller1 {


    @Autowired
    private StudentDao studentDao;
    
    @Autowired
    private LecturerDao lecturerDao;
    
    @Autowired
    private CourseDao courseDao;
    
    @Autowired
    private ReservationDao reservationDao;
    

    @RequestMapping("/")
    public ModelAndView mainPage() {
        return new ModelAndView("main");
    }

    @RequestMapping("/main")
    public ModelAndView mainPage1() {
        return mainPage();
    }

    @RequestMapping("/Courses")
    public ModelAndView coursesPage() {
        return new ModelAndView("Courses");
    }
    
    
    @RequestMapping("StudentCoursesPage")
    public ModelAndView studentCoursesPage(ModelAndView model, HttpSession session) {
        Student student = (Student) session.getAttribute("student");

        if (student == null) {
            model.setViewName("redirect:/StudentSignIn");
            System.out.println("there's no student sign in");
        } else {
            List<Reservation> reservations = reservationDao.getReservations(student.getStudentID());
            model.setViewName("StudentCoursesPage");
            model.addObject("reservations", reservations); // Ensure this matches the JSP
        }

        return model;
    }

    
    
    
    @RequestMapping(value = "/deleteReservation", method = RequestMethod.POST)
    public ModelAndView deleteReservation(@RequestParam("reservationID") int reservationID, HttpSession session) {
        // Retrieve the logged-in student from the session
        Student student = (Student) session.getAttribute("student");

        if (student == null) {
            return new ModelAndView("redirect:/StudentSignIn");
        }

        // Perform the deletion
        boolean isDeleted = reservationDao.deleteReservation(reservationID);

        // Prepare the ModelAndView
        ModelAndView model = new ModelAndView("StudentCoursesPage");

        if (isDeleted) {
            model.addObject("successMessage", "Reservation deleted successfully.");
        } else {
            model.addObject("errorMessage", "Failed to delete reservation.");
        }

        // Refresh the list of reservations
        List<Reservation> reservations = reservationDao.getReservations(student.getStudentID());
        model.addObject("reservations", reservations);

        return model;
    }

    
//    @RequestMapping(value = "/editCourse", method = RequestMethod.GET)
//    public ModelAndView showEditCourseForm(@RequestParam("courseID") int courseID) {
//        Courses course = courseDao.getCourseById(courseID);
//        
//        ModelAndView model = new ModelAndView("EditCoursePage");
//        if (course != null) {
//            model.addObject("course", course);
//        } else {
//            // Handle the case where course is not found (e.g., redirect to an error page)
//            model.setViewName("errorPage");
//            model.addObject("errorMessage", "Course not found.");
//        }
//        return model;
//    }


    @RequestMapping(value = "/updateCourse", method = RequestMethod.POST)
    public ModelAndView updateCourse(@RequestParam("courseID") int courseID,
                                      @RequestParam("courseTitle") String courseTitle) {
        
        boolean isUpdated = courseDao.updateCourseTitle(courseID, courseTitle); 

       
        ModelAndView model = new ModelAndView("LecturerCoursesList");
        if (isUpdated) {
            model.addObject("successMessage", "Course updated successfully.");
        } else {
            model.addObject("errorMessage", "Failed to update course.");
        }

        
        List<Courses> courses = courseDao.getAllCourses();
        model.addObject("courses", courses);
        return model;
    }

    
    @RequestMapping("LecturerCoursesList")
    public ModelAndView lecturerCoursesList(HttpSession session) {
    	
        ModelAndView modelAndView = new ModelAndView();
        
        Lecturer lecturer = (Lecturer) session.getAttribute("lecturer");
        
        if (lecturer == null) {
            modelAndView.setViewName("redirect:/LecturerSignIn");
            System.out.println("No lecturer found in session."); // testing 
        } else {
            System.out.println("Lecturer ID: " + lecturer.getLecturerID());
            List<Courses> courses = courseDao.getCourseByLecturerId(lecturer.getLecturerID());
            System.out.println("Number of courses retrieved: " + courses.size()); //testing 
            
            modelAndView.addObject("courses", courses);
            modelAndView.setViewName("LecturerCoursesList");
        }
        
        return modelAndView;
    }


    
    
    @RequestMapping("LecturerCoursesEdit")
    public ModelAndView addLecturerCourses(ModelAndView model , @ModelAttribute CourseLecturerWrapper courseLecturerWrapper ) {
    	model = new ModelAndView("LecturerCoursesEdit");
    	model.addObject("courseLecturerWrapper" , courseLecturerWrapper);
    	return model;
    }
    
    
    @RequestMapping(value = "addCourse", method = RequestMethod.POST)
    public String addCourse(@ModelAttribute("courseLecturerWrapper") CourseLecturerWrapper wrapper, Model model) {
        // Fetch Lecturer based on userName
        Lecturer lecturer = lecturerDao.findByUserName(wrapper.getLecturer().getUserName());
        if (lecturer == null) {
            model.addAttribute("error", "Lecturer not found");
            return "LecturerCoursesEdit";
        }

        // Set the lecturerID in the course
        Courses course = wrapper.getCourse();
        course.setLecturerID(lecturer.getLecturerID());
        
        // Save the course
        courseDao.save(course);

        model.addAttribute("message", "Course added successfully");
        return "redirect:/LecturerCoursesEdit";
    }
    

    @RequestMapping("/about")
    public ModelAndView aboutPage() {
        return new ModelAndView("about");
    }

    @RequestMapping("/StudentSignIn")
    public ModelAndView studentSignInPage(@ModelAttribute Student student) {
    	ModelAndView model = new ModelAndView("StudentSignIn");
    	model.addObject("student" , student);
        return model;
    }
    
    
    
    @RequestMapping(value = "/studentSignInAuth", method = RequestMethod.POST)
    public ModelAndView studentSignInAuth(@ModelAttribute Student student , HttpSession session) {
        boolean exists = studentDao.getStudentByUserNameAndPassword(student.getUserName(), student.getPassword());

        if (exists) {
        	
        	Student fullStudent = studentDao.findByUserName(student.getUserName());
        	
        	session.setAttribute("student", fullStudent);
            System.out.println(session.getAttribute("student"));
            return new ModelAndView("StudentDashboard");
        } else {
            // Authentication failed, return to the login page with an error message
            ModelAndView model = new ModelAndView("StudentSignIn");
            model.addObject("error", "Invalid username or password.");
            return model;
        }
    }
    
    
    
    @RequestMapping(value = "reserveCourse", method = RequestMethod.POST)
    public ModelAndView reserveCourse(@RequestParam("courseID") int courseID, HttpSession session) {
        // Retrieve the logged-in student from the session using the correct attribute name
        Student student = (Student) session.getAttribute("student");

        if (student == null) {
            
        	ModelAndView model = new ModelAndView("StudentSignIn");
            model.addObject("student", new Student());
            return model;
        }

        int studentID = student.getStudentID();
        
        System.out.println(studentID);
        System.out.println(courseID);

        // Perform the reservation
        boolean isReserved = reservationDao.reserveCourse(studentID, courseID);

        // Prepare the ModelAndView
        ModelAndView model = new ModelAndView("CoursesListPage");

        if (isReserved) {
            model.addObject("successMessage", "Course reserved successfully.");
        } else {
            model.addObject("errorMessage", "Reservation failed. You may have already reserved this course.");
        }

        // Refresh the list of courses
        List<Courses> coursesList = courseDao.getAllCourses();
        model.addObject("coursesList", coursesList);

        return model;
    }

    
    
    
    @RequestMapping(value = "lecturerSignInAuth", method = RequestMethod.POST)
    public ModelAndView lecturerSignInAuth(@ModelAttribute Lecturer lecturer, HttpSession session) {
        boolean exists = lecturerDao.getLecturerByUserNameAndPassword(lecturer.getUserName(), lecturer.getPassword());
        
        if (exists) {
            // Fetch the full lecturer details to ensure the ID is populated
            Lecturer fullLecturer = lecturerDao.findByUserName(lecturer.getUserName());
            session.setAttribute("lecturer", fullLecturer);
            return new ModelAndView("LecturerDashBoard");
        } else {
            ModelAndView model = new ModelAndView("LecturerSignIn");
            model.addObject("error", "Invalid user name or password");
            return model;
        }
    }


    
    
    
    
    
    

    @RequestMapping("/LecturerSignIn")
    public ModelAndView lecturerSignInPage(@ModelAttribute Lecturer lecturer) {
    	ModelAndView model = new ModelAndView("LecturerSignIn");
    	model.addObject("lecturer" , lecturer);
        return model;
    }

    @RequestMapping("/LecturerSignUp")
    public ModelAndView lecturerSignUpPage() {
    	Lecturer lecturer = new Lecturer();
    	ModelAndView model = new ModelAndView("LecturerSignUp");
    	model.addObject("lecturer" , lecturer);
        return model;
    }

    @RequestMapping("/StudentSignUp")
    public ModelAndView studentSignUp() {
        Student student = new Student();
        ModelAndView model = new ModelAndView("StudentSignUp");
        model.addObject("student", student);
        return model;
    }

    @RequestMapping("/Lecturers")
    public ModelAndView lecturersPage() {
        return new ModelAndView("Lecturers");
    }

    
    
    @RequestMapping(value = "lecturerSign", method = RequestMethod.POST)
    public ModelAndView lecturerSign(@ModelAttribute Lecturer lecturer, @RequestParam("confirmPassword") String confirmPassword) {
        ModelAndView model = new ModelAndView("LecturerSignUp");

        if (!lecturer.getPassword().equals(confirmPassword)) {
            System.out.println("Passwords do not match!");  // Debugging
            model.addObject("errorMessage", "Passwords do not match!");
            model.addObject("lecturer", lecturer);
            return model;
        }else {


        lecturerDao.save(lecturer);
        return new ModelAndView("redirect:/");
        }
    }
    
    
    @RequestMapping(value = "coursesList")
    public ModelAndView coursesList() {
    	
    	List<Courses> coursesList = courseDao.getAllCourses();
    	ModelAndView model = new ModelAndView();
    	model.setViewName("CoursesListPage");
    	if(coursesList.isEmpty()) {
    		System.out.println("there's no courses");
    	}
    	
    	else 
    	
    		System.out.println("we have courses yaaaay" + coursesList.size() + coursesList);
    	
    	model.addObject("coursesList" , coursesList);
    	
    	return model;
    	
    	
    }
    
    
    @RequestMapping(value = "/studentSign", method = RequestMethod.POST)
    public ModelAndView studentSign(@ModelAttribute Student student) {
        studentDao.save(student);
        return new ModelAndView("redirect:/");
    }


}
