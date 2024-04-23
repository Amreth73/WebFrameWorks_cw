package com.example.amreth_day10cw1.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day10cw1.model.AmrethDoor;
import com.example.amreth_day10cw1.repository.AmrethDoorRepo;

@Service

public class AmrethDoorService {
    @Autowired
    AmrethDoorRepo doorRepo;
    public AmrethDoor postData(AmrethDoor s)
    {
       return doorRepo.save(s);
    }
    public List<AmrethDoor> getData()
    {
        return doorRepo.findAll();
    }
    public List<AmrethDoor>getDataByColor(String color)
    {
        return doorRepo.findByColor(color);
    }
    public List<AmrethDoor>getByType(String doorType)
    {
        return doorRepo.findByDoorType(doorType);
    }
    public List<AmrethDoor>getById(int id)
    {
        return doorRepo.findByDoorId(id);
    }
    public AmrethDoor updateData(int doorId,String color)
    {
        AmrethDoor exist=doorRepo.findById(doorId).orElse(null);
        if(exist!=null)
        {
            exist.setColor(color);
            return doorRepo.saveAndFlush(exist);

        }
        else
         return null;
    }
    public String deldata(int id)
    {
        doorRepo.deleteById(id);
        return("Door deleted succesfully");
    }
}