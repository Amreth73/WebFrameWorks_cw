package com.example.amreth_day11cw2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.amreth_day11cw2.model.AmrethStudent;
import com.example.amreth_day11cw2.repository.AmrethStudentRepository;


@Service
public class StudentService {
    public AmrethStudentRepository studentRepository;
    public StudentService(AmrethStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public AmrethStudent saveStudent(AmrethStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AmrethStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
