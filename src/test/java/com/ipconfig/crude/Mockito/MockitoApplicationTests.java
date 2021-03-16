package com.ipconfig.crude.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ipconfig.crude.Mockito.doman.Student;
import com.ipconfig.crude.Mockito.repository.StudentRepository;
import com.ipconfig.crude.Mockito.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest

class MockitoApplicationTests {
	@MockBean
	StudentRepository studentrepository;
	
	@Autowired
	StudentService studentservice;
	
	
	@Test
	public void saveStudentTest() {
		 Student student=new Student("fikir", "walle", "fikire@gmail.com", 3.7);
		 
		 when(studentrepository.save(student)).thenReturn(student);
		 
		 assertEquals(student, studentservice.addStudent(student));
		
	}

	@Test
	public void getAllStudentTest() {
		
		when(studentrepository.findAll()).thenReturn(Stream.of(new Student("fikir", "walle", "beki.walle@gmail.com", 
				3.85),new Student("beki", "Gabore", "bekig@gmail.com", 3.7)).collect(Collectors.toList()));
		
		  assertEquals(2, studentservice.getAllstudent().size());
	}
	

	@Test
	public void findStudentByEmailTest() {
		
		
		 Student student=new Student("beki", "Gabore", "fikir.walle@gmail.com", 3.7);
		String testemail="fikir@gmail.com";
		
		
		when(studentrepository.findByEmail(testemail)).
		thenReturn( (student));
			
		
		 assertEquals(student, studentservice.getStudentbyEmail(testemail));
		 
		
	}
	
	@Test
	public void deleteTest() {
		Student student=new Student("fikir", "Gabore", "fikir.walle@gmail.com", 3.7);
		studentservice.deletestudent(student);
		verify(studentrepository,times(1)).delete(student);;
		
	}

}
