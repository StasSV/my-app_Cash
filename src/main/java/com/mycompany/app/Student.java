package com.mycompany.app;

import java.util.List;

public class Student {
	private int studentId;
	private String pib;
	private int course;

	public Student(String string, int i) {
		this.pib = string;
		this.course=i;
	}
	


	public Student() {
		// TODO Auto-generated constructor stub
	}

	// Geters and seters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

}
