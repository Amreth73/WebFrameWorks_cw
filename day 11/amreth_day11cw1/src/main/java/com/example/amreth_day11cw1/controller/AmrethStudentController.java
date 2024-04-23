package com.example.amreth_day11cw1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day11cw1.modal.AmrethStudent;
import com.example.amreth_day11cw1.modal.AmrethStudentInfo;
import com.example.amreth_day11cw1.service.AmrethStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AmrethStudentController {
    public AmrethStudentService studentService;
    public AmrethStudentController(AmrethStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public AmrethStudent postMethodName(@RequestBody AmrethStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AmrethStudentInfo postMethodName(@RequestBody AmrethStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AmrethStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}