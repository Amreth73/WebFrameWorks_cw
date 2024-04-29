package com.example.amreth_day14_cw1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day14_cw1.model.AmrethPayroll;
import com.example.amreth_day14_cw1.service.AmrethPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PayrollController {
    @Autowired
    AmrethPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public AmrethPayroll addPayroll(@PathVariable Long employeeId,@RequestBody AmrethPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<AmrethPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
