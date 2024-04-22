package com.example.amreth_day8cw2.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.amreth_day8cw2.model.AmrethProduct;
import com.example.amreth_day8cw2.repository.AmrethProductRepo;


@Service
public class AmrethProductService {
    @Autowired
    private AmrethProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(AmrethProduct person)
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

    public List<AmrethProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<AmrethProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<AmrethProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}

