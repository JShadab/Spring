package com.wipro.service;

import com.wipro.entity.Student;
import com.wipro.repository.StudentDAO;

public class StudentService {

	private StudentDAO studentDAO;

	public StudentService(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	public int saveStudent(Student student) {
		return studentDAO.saveStudent(student);

	}

}
