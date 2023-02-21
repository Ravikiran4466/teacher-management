package com.birla.soft.service;

import java.util.List;

import com.birla.soft.Entity.Teacher;
import com.birla.soft.Entity.TeacherDTO;

public interface TeacherInterface {

	Teacher saveTeacher(Teacher teacher);

	List<TeacherDTO> getAll();

	Teacher getbyID(int id) throws ResourceNotFoundException;

	List<Teacher> getbyteacherName(String teacherName);

	Teacher getbyaddress(String address);

	

}
