package com.example.amreth_day7cw1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day7cw1.model.AmrethPerson;
import com.example.amreth_day7cw1.service.AmrethPersonService;

import java.util.*;

@RestController
public class AmrethPersonController {
    @Autowired
    private AmrethPersonService ser;
    
    @PostMapping("/api/person")
    public ResponseEntity<AmrethPerson> post(@RequestBody AmrethPerson person)
    {
        if(ser.post(person))
        {
            return new ResponseEntity<>(person,HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/person")
    public ResponseEntity<List<AmrethPerson>> getAll()
    {
        List<AmrethPerson> li = ser.getAll();
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/person/byAge")
    public ResponseEntity<List<AmrethPerson>> getbyAge(@RequestParam int age)
    {
        List<AmrethPerson> li = ser.getbyAge(age);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

