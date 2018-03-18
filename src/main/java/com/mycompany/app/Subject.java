package com.mycompany.app;

import java.util.List;

import javax.persistence.*;

@Entity
public class Subject {

	@Id
	@Column(name = "sublectID")
	private long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Lector lector;

	@ManyToMany
	@JoinTable(name = "Students", joinColumns = @JoinColumn(name = "sublectID"), inverseJoinColumns = @JoinColumn(name = "studentID"))
	private List<Student> students;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Lector getLector() {
		return lector;
	}

	public void setLector(Lector lecturer) {
		this.lector = lecturer;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
