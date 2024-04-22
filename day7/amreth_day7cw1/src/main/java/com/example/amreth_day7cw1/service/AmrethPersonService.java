package com.example.amreth_day7cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day7cw1.model.AmrethPerson;
import com.example.amreth_day7cw1.repository.AmrethPersonRepo;


@Service
public class AmrethPersonService {
    @Autowired
    private AmrethPersonRepo rep;

    public boolean post(AmrethPerson person)
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

    public List<AmrethPerson> getAll()
    {
        return rep.findAll();
    }

    public List<AmrethPerson> getbyAge(int age)
    {
        return rep.findByAge(age);
    }
    
}
