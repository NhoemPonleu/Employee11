package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Student;
@SpringBootTest
class StudentRepositoryTest {
@Autowired
private StudentRepository studentRepository;
	@Test
	public void saveStudent() {
		Student student1=Student.builder()
				// .studentId(null)
				 .emailId("ponleu@gamail.com")
				 .firstName("Nhoem")
				 .lastName("Poneleu")
				 .guardianName("lsieuriu")
				 
				 .guardianEmail("sjljdjfeo@dksjl.com")
				 .guardianMobile("0933884")
				 .build();
		 studentRepository.save(student1);
		
	}

}
