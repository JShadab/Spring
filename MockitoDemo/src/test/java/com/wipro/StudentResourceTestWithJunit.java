package com.wipro;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.wipro.entity.Student;
import com.wipro.service.StudentService;

@RunWith(MockitoJUnitRunner.class)
public class StudentResourceTestWithJunit {

	private Student student;

	private StudentResource studentResource;

	@Mock
	private StudentService studentService;

	@Before
	public void setup() {

		student = new Student("Shadab", "Mockito");
		studentResource = new StudentResource(studentService);

	}

	@Test
	public void testSaveStudent() {

		when(studentService.saveStudent(student)).thenReturn(1);

		int id = studentResource.saveStudent(student);

		assertEquals(1, id);

	}

}
