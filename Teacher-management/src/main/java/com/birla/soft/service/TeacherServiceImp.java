package com.birla.soft.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birla.soft.Entity.Teacher;
import com.birla.soft.Entity.TeacherDTO;
import com.birla.soft.repository.Repository;

@Service
public class TeacherServiceImp implements TeacherInterface {

	@Autowired
	Repository repository;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		Teacher teacherSaved = repository.save(teacher);
		if (teacher.getTeacherName() == null) {
			throw new NullPointerException();
		}
		return teacherSaved;
	}

	@Override
	public List<TeacherDTO> getAll() {
		return repository.findAll().stream().map(this::fromEntitytoDTO).collect(Collectors.toList());

	}

	public TeacherDTO fromEntitytoDTO(Teacher teacher) {
		TeacherDTO teacherDTO = new TeacherDTO();
		teacherDTO.setEmail(teacher.getEmail());
		teacherDTO.setTeacherName(teacher.getTeacherName());

		return teacherDTO;

	}

	@Override
	public Teacher getbyID(int id) throws ResourceNotFoundException {
		Teacher teachergetbyid = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No data found on the database"));
		return teachergetbyid;
	}

	@Override
	public List<Teacher> getbyteacherName(String teacherName) {
		List<Teacher> getall = repository.findByteacherName(teacherName);
		return getall;
	}

	@Override
	public Teacher getbyaddress(String address) {
		Teacher teacher = repository.findByaddress(address);
		return teacher;
	}

}
