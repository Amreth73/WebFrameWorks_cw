package com.example.amreth_day12cw2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day12cw2.model.AmrethStudent;
import com.example.amreth_day12cw2.service.AmrethStudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AmrethStudentController{
    @Autowired
    AmrethStudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<AmrethStudent> addStudents(@RequestBody AmrethStudent student)
    {
        return new ResponseEntity<>(studentService.addStudents(student),HttpStatus.CREATED);
    }
    
    @GetMapping("/students-inner-join")
    public ResponseEntity<List<AmrethStudent>>getStudentsInner()
    {
        return new ResponseEntity<>(studentService.getStudentInner(),HttpStatus.OK);
    }
    @GetMapping("/students-left-outer-join")
    public ResponseEntity<List<AmrethStudent>> getStudentsLeftOuter()
    {
        return new ResponseEntity<>(studentService.getStudentLeftOuter(),HttpStatus.OK);
    }
   
}


