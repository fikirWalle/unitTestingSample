package com.ipconfig.crude.Mockito.doman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author Fikir Blessed
 * @since   2020-07-16
 *  an interface contain different different private members of Student
 *
 */

@Entity
public class Student {
	
	/**
	 * Student id is generated automatically
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	/**
	 * Student id first name,last name email,salary
	 */
	private long id;
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private double gpa;
	/**
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param salary
	 */
	public Student() {
		
	}
	

	public Student(String firstName, String lastName, String email, double gpa) {
		
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gpa = gpa;
	}

/**
 * 
 * @return Student id;
 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
/**
 * 
 * @return Student First Name;
 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @param lastName
	 * set Student last name
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
/**
 * 
 * @return return last name of Student
 */
	public String getLastName() {
		return lastName;
	}
/**
 * 
 * @param lastName
 * set Student last name
 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
/**
 * 
 * @return Student Email
 */
	public String getEmail() {
		return email;
	}
/**
 * 
 * @param email
 * set Student email
 */
	public void setEmail(String email) {
		this.email = email;
	}
/**
 * 
 * @return Student Salary
 */
	public double getGpa() {
		return gpa;
	}
/**]
 * 
 * @param salary
 * set Student salary
 */
	public void setGpa(double salary) {
		this.gpa = salary;
	}
	
	
}
