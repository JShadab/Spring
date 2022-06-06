package com.wipro.repository;

import java.util.HashMap;

import com.wipro.entity.Student;

public class StudentDAO {

	private HashMap<Integer, Student> db;

	public StudentDAO() {
		db = new HashMap<Integer, Student>();
	}

	public int saveStudent(Student student) {

		int size = db.size();

		int id = size + 1;

		db.put(id, student);

		return id;

	}

}
