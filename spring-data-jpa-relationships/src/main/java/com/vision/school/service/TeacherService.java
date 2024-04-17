package com.vision.school.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vision.school.entity.Teacher;
import com.vision.school.repository.TeacherRepository;

@Service
public class TeacherService {
	
	 @Autowired
	 private TeacherRepository teacherRepository;

	public List<Teacher> findAll() {
		return teacherRepository.findAll();
	}

	public Teacher save(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public Optional<Teacher> findById(Long teacherId) {
		return teacherRepository.findById(teacherId);
	}


}
