package com.stmp;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class StudentEntity implements Serializable {
	@Id
	private int StudentId;
	private String name;
	private String course;
	private String email;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentEntity [StudentId=" + StudentId + ", name=" + name + ", course=" + course + ", email=" + email
				+ "]";
	}
	
}
