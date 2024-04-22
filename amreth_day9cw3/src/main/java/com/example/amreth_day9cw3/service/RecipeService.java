package com.example.amreth_day9cw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day9cw3.model.Recipe;
import com.example.amreth_day9cw3.repository.RecipeRepo;


@Service
public class RecipeService {
    @Autowired
    private RecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(Recipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public Recipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<Recipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
