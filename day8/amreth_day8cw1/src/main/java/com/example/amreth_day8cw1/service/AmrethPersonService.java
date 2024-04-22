package com.example.amreth_day8cw1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day8cw1.model.AmrethPerson;
import com.example.amreth_day8cw1.repository.AmrethPersonRepo;


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

    public List<AmrethPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AmrethPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
