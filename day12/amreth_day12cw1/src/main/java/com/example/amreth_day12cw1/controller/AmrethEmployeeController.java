package com.example.amreth_day12cw1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day12cw1.model.AmrethEmployee;
import com.example.amreth_day12cw1.service.AmrethEmployeeService;


@RestController
public class AmrethEmployeeController {
    @Autowired
    AmrethEmployeeService employeeService;

    @PostMapping("/employee")
    public AmrethEmployee setMethod(@RequestBody AmrethEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<AmrethEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<AmrethEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
