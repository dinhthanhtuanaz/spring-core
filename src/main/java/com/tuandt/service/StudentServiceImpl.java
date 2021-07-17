package com.tuandt.service;

import java.util.List;

import com.tuandt.model.Student;
import com.tuandt.repository.StudentRepository;
import com.tuandt.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {

	// new StudentRepositoryImpl(); Như này là constructor drawbacks
	// hard code: nếu khởi tạo có 2 đối số, lúc sau StudentRepositoryImpl update
	// có thêm 1 đối số nữa. Rõ ràng phải sửa ở cả đây => Hard code.
	// high coupling (bị phụ thuộc cao mặc dù đã tách interface)
	// private StudentRepository studentRepository = new StudentRepositoryImpl();

	private StudentRepository studentRepository;

	public StudentServiceImpl() {
		super();
	}
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		System.out.println("Constructor...");
		this.studentRepository = studentRepository;
	}

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository2) {
		System.out.println("Setter...");
		this.studentRepository = studentRepository2;
	}

	public List<Student> getAllStudent() {
		return studentRepository.getAllStudent();
	}

}
