package com.example.amreth_day12cw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day12cw2.model.AmrethStudentDetail;
import com.example.amreth_day12cw2.service.AmrethStudentDetailService;


@RestController
public class AmrethStudentDetailController {
    @Autowired
    AmrethStudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<AmrethStudentDetail> addStudentDetails(@PathVariable int id,@RequestBody AmrethStudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
