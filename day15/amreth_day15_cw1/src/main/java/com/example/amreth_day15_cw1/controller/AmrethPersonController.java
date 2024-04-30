package com.example.amreth_day15_cw1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day15_cw1.model.Person;
import com.example.amreth_day15_cw1.service.AmrethPersonService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AmrethPersonController {
    @Autowired
    public AmrethPersonService personService;

    @GetMapping("/persons")
    public List<Person> getMethodName() {
        return personService.getData();
    }

    @PostMapping("/persons")
    public Person postMethodName(@RequestBody Person entity) {
        return personService.postDaata(entity);
    }
    
    
}
