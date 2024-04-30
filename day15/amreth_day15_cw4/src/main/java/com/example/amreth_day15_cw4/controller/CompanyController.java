package com.example.amreth_day15_cw4.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import com.example.amreth_day15_cw4.model.Company;
import com.example.amreth_day15_cw4.service.CompayService;


@RestController
@Slf4j
public class CompanyController {
    @Autowired
    public CompayService companyService;

    @GetMapping("/companies")
    public List<Company> getMethodName() {
        log.info("method:{GET}");
        return companyService.getData();
    }

    @GetMapping("/companies/{id}")
    public Company getOneMethodName(@PathVariable int param) {
        log.info("method:{GET}");
        return companyService.getOneData(param);
    }

    @PostMapping("/companies")
    public Company postMethodName(@RequestBody Company entity) {
        log.info("method:{POST}");
        return companyService.postData(entity);
    }
    
    @DeleteMapping("companies/{id}")
    public String deleteMethodName(@PathVariable int id){
     companyService.deleteData(id);
        log.info("method:{DELETE}");
        return "Deleted";
    }
    
    @PutMapping("companies/{id}")
    public Company putMethodName(@PathVariable int id, @RequestBody Company entity) {
        log.info("method:{PUT}");
        return companyService.putData(id, entity);
    }
}
