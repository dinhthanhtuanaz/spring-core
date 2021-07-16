package com.tuandt;

import java.util.List;

import com.tuandt.model.Student;
import com.tuandt.service.StudentServiceImpl;

public class StudentApp {
	public static void main(String[] args) {
		StudentServiceImpl studentService = new StudentServiceImpl();
		List<Student> studentList = studentService.getAllStudent();
		System.out.println(studentList.get(0));
	}
}