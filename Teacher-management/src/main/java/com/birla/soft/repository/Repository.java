package com.birla.soft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.birla.soft.Entity.Teacher;
import com.birla.soft.Entity.TeacherDTO;

public interface Repository extends JpaRepository<Teacher, Integer> {

	public List<Teacher> findByteacherName(String teacherName);

	public Teacher findByaddress(String address);

	@Query(value = "select * from teacher_details where id=1;", nativeQuery=true)
	public Teacher getDetailsByID(int id);

}
