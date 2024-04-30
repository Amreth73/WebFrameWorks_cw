package com.example.amreth_day15_cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day15_cw1.model.Person;
import com.example.amreth_day15_cw1.repository.AmrethPersonRepo;


@Service
public class AmrethPersonService {
    @Autowired
    public AmrethPersonRepo personRepo;
    public List<Person> getData(){
        return personRepo.findAll();
    }
    public Person postDaata(Person p){
        return personRepo.save(p);
    }
}
