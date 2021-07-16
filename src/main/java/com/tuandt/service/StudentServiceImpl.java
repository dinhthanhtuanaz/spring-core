package com.tuandt.service;

import java.util.List;

import com.tuandt.model.Student;
import com.tuandt.repository.StudentRepositoryImpl;

public class StudentServiceImpl {
	
	private StudentRepositoryImpl studentRepository = new StudentRepositoryImpl();
	
	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}
}
