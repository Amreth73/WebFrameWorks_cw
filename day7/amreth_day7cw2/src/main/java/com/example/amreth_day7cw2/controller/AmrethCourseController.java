package com.example.amreth_day7cw2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day7cw2.model.AmrethCourse;
import com.example.amreth_day7cw2.service.AmrethCourseService;

import java.util.*;

@RestController
public class AmrethCourseController {
    @Autowired
    private AmrethCourseService ser;

    @PostMapping("/api/course")
    public ResponseEntity<AmrethCourse> post(@RequestBody AmrethCourse person) {
        if (ser.post(person)) {
            return new ResponseEntity<>(person, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/course")
    public ResponseEntity<List<AmrethCourse>> getAll() {
        List<AmrethCourse> li = ser.getAll();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/course/{courseName}")
    public ResponseEntity<List<AmrethCourse>> getbyAge(@PathVariable String courseName) {
        List<AmrethCourse> li = ser.getbyAge(courseName);
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
