package com.vision.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vision.school.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {}
