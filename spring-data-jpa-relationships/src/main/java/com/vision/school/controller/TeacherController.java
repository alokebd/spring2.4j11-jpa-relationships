package com.vision.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vision.school.entity.Teacher;
import com.vision.school.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    
	@Autowired
    private TeacherService teacherService;
    
    @GetMapping
    List<Teacher> getTeachers() {
        return teacherService.findAll();
    }

    @PostMapping
    Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }
}
