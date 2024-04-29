package com.example.amreth_day14_cw1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day14_cw1.model.AmrethEmployee;
import com.example.amreth_day14_cw1.repository.AmrethEmployeeRepo;


@Service

public class AmrethEmployeeService {
    @Autowired
    AmrethEmployeeRepo employeeRepo;

    public AmrethEmployee addEmployee(AmrethEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AmrethEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<AmrethEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
