package com.example.amreth_day15_cw2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day15_cw2.model.AmrethPlayer;
import com.example.amreth_day15_cw2.service.AmrethPlayerService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@Slf4j
public class AmrethPlayerController {
    @Autowired
    public AmrethPlayerService playerService;

    @GetMapping("/players")
    public List<AmrethPlayer> getMethodName() {
        log.info("method={GET}");
        return playerService.getData();
    }

    @GetMapping("/players/{playerId}")
    public AmrethPlayer getOneMethodName(@PathVariable int id){
        log.info("method={GET}");
        return playerService.getOneData(id);
    }
    
    @PostMapping("/players")
    public AmrethPlayer postMethodName(@RequestBody AmrethPlayer entity) {
        log.info("method={POST}");
        return playerService.postData(entity);
    }
    
}
