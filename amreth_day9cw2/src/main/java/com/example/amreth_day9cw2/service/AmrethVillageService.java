package com.example.amreth_day9cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day9cw2.modal.AmrethVillage;
import com.example.amreth_day9cw2.repository.AmrethVillageRepo;


@Service
public class AmrethVillageService {
    @Autowired
    private AmrethVillageRepo rep;

    public boolean post(AmrethVillage person)
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

    public AmrethVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public AmrethVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<AmrethVillage> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
