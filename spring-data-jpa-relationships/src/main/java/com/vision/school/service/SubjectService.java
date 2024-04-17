package com.vision.school.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vision.school.entity.Subject;
import com.vision.school.repository.SubjectRepository;

@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

	public List<Subject> findAll() {
		return subjectRepository.findAll();
	}

	public Subject save(Subject subject) {
		return subjectRepository.save(subject);
	}

	public Optional<Subject> findById(Long subjectId) {
		return subjectRepository.findById(subjectId);
	}

}
