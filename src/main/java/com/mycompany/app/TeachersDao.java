package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

public interface TeachersDao {
	@Autowired
	void addTeacher(Teacher teacher);

	@Autowired
	Teacher getTeacherById(int id);

	@Autowired
	void saveTacher(Teacher teacher);
}
