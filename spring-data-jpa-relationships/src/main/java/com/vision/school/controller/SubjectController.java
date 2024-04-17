package com.vision.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vision.school.entity.Student;
import com.vision.school.entity.Subject;
import com.vision.school.entity.Teacher;
import com.vision.school.service.StudentService;
import com.vision.school.service.SubjectService;
import com.vision.school.service.TeacherService;
import java.util.List;


@RestController
@RequestMapping("/subjects")
public class SubjectController {

	@Autowired
	private StudentService studentService;
	
    @Autowired
    private SubjectService subjectService;

    @Autowired
    TeacherService teacherService;

    @GetMapping
    public List<Subject> getSubjects() {
        return subjectService.findAll();
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.save(subject);
    }

    @PutMapping("/{subjectId}/students/{studentId}")
    public Subject addStudentToSubject( @PathVariable Long subjectId, @PathVariable Long studentId) {
        Subject  subject = subjectService.findById(subjectId).get();
        Student student =  studentService.findById(studentId).get();
        subject.getEnrolledStudents().add(student);
        return subjectService.save(subject);
    }

    @PutMapping("/{subjectId}/teacher/{teacherId}")
    public Subject assignTeacherToSubject(@PathVariable Long subjectId, @PathVariable Long teacherId) {
        Subject subject = subjectService.findById(subjectId).get();
        Teacher teacher = teacherService.findById(teacherId).get();
        subject.setTeacher(teacher);
        return subjectService.save(subject);
    }
}
