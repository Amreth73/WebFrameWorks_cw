package com.example.amreth_day15_cw4.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import com.example.amreth_day15_cw4.model.Employee;
import com.example.amreth_day15_cw4.service.EmployeeService;


@RestController
@Slf4j
public class EmployeeController {
 @Autowired
    public EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getMethodName() {
        log.info("method:{GET}");
        return employeeService.getData();
    }

    @GetMapping("/employees/{id}")
    public Employee getOneMethodName(@PathVariable int param) {
        log.info("method:{GET}");
        return employeeService.getOneData(param);
    }

    @PostMapping("/employees")
    public Employee postMethodName(@RequestBody Employee entity) {
        log.info("method:{POST}");
        return employeeService.postData(entity);
    }
    
    @DeleteMapping("employees/{id}")
    public String deleteMethodName(@PathVariable int id){
        employeeService.deleteData(id);
        log.info("method:{DELETE}");
        return "Deleted";
    }
    
    @PutMapping("employees/{id}")
    public Employee putMethodName(@PathVariable int id, @RequestBody Employee entity) {
        log.info("method:{PUT}");
        return employeeService.putData(id, entity);
    }
}
