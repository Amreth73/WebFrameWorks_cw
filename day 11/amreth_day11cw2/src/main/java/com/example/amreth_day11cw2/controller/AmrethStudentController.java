package com.example.amreth_day11cw2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day11cw2.model.AmrethStudent;
import com.example.amreth_day11cw2.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AmrethStudentController {
    public StudentService studentService;
    public AmrethStudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public AmrethStudent postMethodName(@RequestBody AmrethStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<AmrethStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
