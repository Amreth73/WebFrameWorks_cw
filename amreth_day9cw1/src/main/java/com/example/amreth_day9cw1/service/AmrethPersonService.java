package com.example.amreth_day9cw1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.amreth_day9cw1.model.AmrethPerson;
import com.example.amreth_day9cw1.repository.AmrethPersonRepo;


@Service
public class AmrethPersonService {
    public AmrethPersonRepo personRepo;

    public AmrethPersonService(AmrethPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(AmrethPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<AmrethPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}

