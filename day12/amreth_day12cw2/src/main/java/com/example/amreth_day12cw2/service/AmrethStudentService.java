package com.example.amreth_day12cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day12cw2.model.AmrethStudent;
import com.example.amreth_day12cw2.repository.AmrethStudentRepository;


@Service
public class AmrethStudentService {
    @Autowired
    AmrethStudentRepository studentRepository;
    public AmrethStudent addStudents(AmrethStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AmrethStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<AmrethStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<AmrethStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
