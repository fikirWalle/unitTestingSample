package com.ipconfig.crude.Mockito.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipconfig.crude.Mockito.doman.Student;
import com.ipconfig.crude.Mockito.service.StudentService;
/**
 * 
 * @author Fikir Blessed
 * this class is used to Student Controller class
 * which is Rest controller
 * Presentation layer is Connect with This Class
 *
 */
@RestController
public class StudentController {
	/**
	 * it is student service dependency injection
	 * using @Autowired 
	 */
    @Autowired
	 StudentService studentservice;
	

	/**
	 * 
	 * @param student
	 * @return saved student.
	 */
	   @PostMapping("/save")
		public Student saveStudent(Student student) {	
		   
		   
		   return studentservice.addStudent(student);		
		
		}
	   /**
	    * 
	    * @return list of Student found in database
	    */
		   @GetMapping("/getAll")
		   public List<Student> getStudent() {		   
			   return studentservice.getAllstudent();
		   }
		   /**
		    * 
		    * @param email
		    * @return student which has the same email
		    */
		   @GetMapping("/getstudent/{email}")
		   public Student getStudentbyEmail(@PathVariable("email") String email) {
			   
			   return studentservice.getStudentbyEmail(email);
		   }
		   /**
		    * 
		    * @param student
		    * @return the removed student
		    */
		   
		   @DeleteMapping("/deletestudent")
	
	   public Student removeAll(Student student) {
			   
			   studentservice.deletestudent(student);
			   
			   return student;
			   
		   } 

}
