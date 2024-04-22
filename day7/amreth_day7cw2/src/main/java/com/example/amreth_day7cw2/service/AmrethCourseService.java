package com.example.amreth_day7cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day7cw2.model.AmrethCourse;
import com.example.amreth_day7cw2.repository.AmrethCourseRepo;


@Service
public class AmrethCourseService {
    @Autowired
    private AmrethCourseRepo rep;

    public boolean post(AmrethCourse person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AmrethCourse> getAll()
    {
        return rep.findAll();
    }

    public List<AmrethCourse> getbyAge(String courseName)
    {
        return rep.findByCourseName(courseName);
    }
    
}
