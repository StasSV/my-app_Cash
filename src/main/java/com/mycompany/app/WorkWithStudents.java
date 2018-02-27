package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {
	@Autowired
	private StudentsDao studentsDao;

	public void saveStudentToDb(Student student) {
		System.out.println("we are around adding...");
		if ((student != null) && (student.getPib() != null) && (!"".equals(student.getPib()))
				&& (student.getCourse() > 0)) {

			studentsDao.addStudent(student);
			System.out.println("Student have been saved " + student);
		}
	}

	public Student getStudentById(int id) {
		Student temp = studentsDao.getStudentById(id);
		return temp;
	}
}
