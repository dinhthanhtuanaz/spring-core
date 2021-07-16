package com.tuandt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tuandt.service.StudentService;

public class StudentApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentService studentService = context.getBean("studentService", StudentService.class);
		System.out.println(studentService.getAllStudent().size());
	}
}
