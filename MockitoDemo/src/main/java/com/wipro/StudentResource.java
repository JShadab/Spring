package com.wipro;

import com.wipro.entity.Student;
import com.wipro.service.StudentService;

public class StudentResource {

	private StudentService studentService;

	public StudentResource(StudentService studentService) {
		this.studentService = studentService;
	}

	public int saveStudent(Student student) {
		return studentService.saveStudent(student);

	}

}
