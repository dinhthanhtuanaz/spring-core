package com.tuandt.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tuandt.model.Student;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {
	
	public List<Student> getAllStudent() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Tuan", "Fresher"));
		studentList.add(new Student("Tung", "Junior"));
		return studentList;
	}
}
