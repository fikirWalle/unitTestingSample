package com.ipconfig.crude.Mockito.repository;

import org.springframework.data.repository.CrudRepository;

import com.ipconfig.crude.Mockito.doman.Student;
/**
 * 
 * @author Fikir Blessed
 * 
 * this interface serve as Repository which helps connect with the databse
 *
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
	
	
	
	public Student findByEmail(String email);

}
