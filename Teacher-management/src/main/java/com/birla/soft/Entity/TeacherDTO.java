package com.birla.soft.Entity;

public class TeacherDTO {

	private String teacherName;
	private String email;

	public TeacherDTO(String teacherName, String email) {
		super();
		this.teacherName = teacherName;
		this.email = email;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TeacherDTO() {

	}

}
