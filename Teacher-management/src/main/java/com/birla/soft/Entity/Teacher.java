package com.birla.soft.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Teacher_Details")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Size(min = 5, message = "please Enter the Name minimum characters of 5")
	@NotEmpty
	private String teacherName;

	@Size(min = 5, message = "please Enter the Address minimum characters of 5")
	@NotEmpty
	private String address;

	@Size(min = 5, message = "please Enter the Name minimum characters of 5")
	@Email
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teacherName=" + teacherName + ", address=" + address + ", email=" + email + "]";
	}

	public Teacher(int id, String teacherName, String address, String email) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.address = address;
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Teacher() {

	}

}
