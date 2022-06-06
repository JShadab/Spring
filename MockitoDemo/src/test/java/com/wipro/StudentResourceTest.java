package com.wipro;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import com.wipro.entity.Student;
import com.wipro.service.StudentService;

public class StudentResourceTest {

	public static void main(String[] args) {

		Student student = new Student("Shadab", "Mockito");

//		StudentDAO studentDAO = new StudentDAO();
//		StudentService studentService = new StudentService(studentDAO); // REAL

		StudentService studentService = Mockito.mock(StudentService.class); // MOCK -> STUD -> SPY -> PROXY

		when(studentService.saveStudent(student)).thenReturn(1);

		StudentResource studentResource = new StudentResource(studentService);
		int id = studentResource.saveStudent(student);

		if (id == 1) {
			System.out.println("Test Pass !!!");
		} else {
			System.out.println("Test Fail !!!");
		}

	}

}
