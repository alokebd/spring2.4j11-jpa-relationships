package com.vision.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vision.school.entity.Student;
import com.vision.school.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
 
	@Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }
}