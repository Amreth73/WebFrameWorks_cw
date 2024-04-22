package com.example.springapp.ClassExerciseDay8.exercise3.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.ClassExerciseDay8.exercise3.model.AmrethStudent;
import com.example.springapp.ClassExerciseDay8.exercise3.repository.AmrethStudentRepo;

@Service
public class AmrethStudentService {
    @Autowired
    private AmrethStudentRepo studentRepo;

    public boolean post(AmrethStudent student)
    {
        try
        {
            studentRepo.save(student);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AmrethStudent> getAll()
    {
        return studentRepo.findAll();
    }

    public List<AmrethStudent> getGreater(int marks)
    {
        return studentRepo.findByMarksGreaterThan(marks);
    }

    public List<AmrethStudent> getLesser(int marks)
    {
        return studentRepo.findByMarksLessThan(marks);
    }
    
}

