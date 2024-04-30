package com.example.amreth_day16_cw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day16_cw1.service.AmrethMyService;


@RestController
public class AmrethMyController {

    @Autowired
    public AmrethMyService myService;

    public void AppController(){
        myService.AppService();
    }

}
