package com.tuandt.repository;

import java.util.ArrayList;
import java.util.List;

import com.tuandt.model.Student;

public class StudentRepositoryImpl {
	
	public List<Student> getAllStudent() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Tuan", "Fresher"));
		return studentList;
	}
}
