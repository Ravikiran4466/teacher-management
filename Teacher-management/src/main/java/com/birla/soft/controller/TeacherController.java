package com.birla.soft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.birla.soft.Entity.Teacher;
import com.birla.soft.Entity.TeacherDTO;
import com.birla.soft.service.ResourceNotFoundException;
import com.birla.soft.service.TeacherInterface;

/*
 * 
 * @author ravikiran Namana
 * 
 * 
 * */

@RestController
public class TeacherController {

	@Autowired
	TeacherInterface teacherInterface;

	@PostMapping("/create")
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) {
		Teacher teacherSave = teacherInterface.saveTeacher(teacher);
		return new ResponseEntity<Teacher>(teacherSave, HttpStatus.OK);

	}

	@GetMapping("/findAll")
	public ResponseEntity<List<TeacherDTO>> getAll() {
		List<TeacherDTO> findAll = teacherInterface.getAll();
		return new ResponseEntity<>(findAll, HttpStatus.ACCEPTED);

	}

	@PutMapping("/update")
	public ResponseEntity<Teacher> update(@RequestBody Teacher teacher) {
		Teacher teacherUpdate = teacherInterface.saveTeacher(teacher);
		return new ResponseEntity<>(teacherUpdate, HttpStatus.OK);

	}

	@GetMapping("/get/{teacherName}")
	public ResponseEntity<List<Teacher>> getbyName(@PathVariable String teacherName) {
		List<Teacher> teacher = teacherInterface.getbyteacherName(teacherName);
		return new ResponseEntity<>(teacher, HttpStatus.OK);
	}

	@GetMapping("/find/{address}")
	public ResponseEntity<Teacher> getbyAddress(@PathVariable String address) {
		Teacher teacher = teacherInterface.getbyaddress(address);
		return new ResponseEntity<>(teacher, HttpStatus.ACCEPTED);
	}

	@GetMapping("/search/{id}")
	public ResponseEntity<Teacher> getbyidDetails(@PathVariable int id) throws ResourceNotFoundException {
		Teacher teacher = teacherInterface.getbyID(id);
		return new ResponseEntity<>(teacher, HttpStatus.OK);
	}

}
