package com.birla.soft;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.birla.soft.Entity.Teacher;
import com.birla.soft.repository.Repository;

@DataJpaTest
class TeacherSaveTest {

	@Autowired
	Repository repository;

	@Test
	public void TeacherTestcreate() {

		Teacher teacher = new Teacher();
		teacher.setAddress("hyd");
		teacher.setEmail("ravikiran@gmail.com");
		teacher.setTeacherName("superstart");
		teacher.setId(1);

		repository.save(teacher);
	 assertThat(teacher.getId()).isGreaterThan(0);
	 System.out.println("here is the out :" +teacher);
	 

	}
	@Test
	
	public void TeacherTest() {
		
		List<Teacher> teacher = repository.findByteacherName("superstart");
		assertThat(((Teacher) teacher).getTeacherName()).isEqualTo("superstart");
		
	}

}
