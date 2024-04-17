package com.vision.school.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vision.school.entity.Student;
import com.vision.school.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
    StudentRepository studentRepository;

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public Optional<Student> findById(Long studentId) {
		return studentRepository.findById(studentId);
	}

	
	
	

}
