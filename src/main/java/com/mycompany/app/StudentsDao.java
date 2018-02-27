package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

public interface StudentsDao {
	@Autowired
	void addStudent(Student student);
	
	@Autowired
	Student getStudentById(int id);
	
}
