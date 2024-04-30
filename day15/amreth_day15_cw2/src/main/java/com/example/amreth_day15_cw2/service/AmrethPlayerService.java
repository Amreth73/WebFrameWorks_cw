package com.example.amreth_day15_cw2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day15_cw2.model.AmrethPlayer;
import com.example.amreth_day15_cw2.repository.AmrethPlayerRepo;

@Service
public class AmrethPlayerService {
    @Autowired
    public AmrethPlayerRepo playerRepo;

    public AmrethPlayer postData(AmrethPlayer p){
        return playerRepo.save(p);
    }

    public AmrethPlayer getOneData(int id){
        return playerRepo.findById(id).orElseThrow();
    }

    public List<AmrethPlayer> getData(){
        return playerRepo.findAll();
    }
}
