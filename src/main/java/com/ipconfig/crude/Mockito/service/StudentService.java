package com.ipconfig.crude.Mockito.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipconfig.crude.Mockito.doman.Student;
import com.ipconfig.crude.Mockito.repository.StudentRepository;

/**
* 
* @author Fikir Blessed
* this class is implement the business 
* we can implement different Implementation for Student
*/


@Service
public class StudentService {
	/**
	 * using @Autowired student repository interface we can implement our business here
	 */
	@Autowired
	StudentRepository studentRepository;
	
	/**
	 * 
	 * @param student
	 * @return saved student it sends to DB
	 */
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
		
	}
	/**
	 * 
	 * @return Listof Student found in database
	 */
	public List<Student>getAllstudent(){
		
		  List<Student>studlist= (List<Student>) studentRepository.findAll();
		return  studlist; 
	}
	/**
	 * 
	 * @param email
	 * @return student which has same email 
	 */
	public Student getStudentbyEmail(String email) {
		
		Student student=studentRepository.findByEmail(email);
		
		  return student;
		
	}
	/***
	 * 
	 * @param student
	 * @return nothing
	 * delete student
	 */
	public void deletestudent(Student student) {
		
		studentRepository.delete(student);;
		
	}
	
	

}
