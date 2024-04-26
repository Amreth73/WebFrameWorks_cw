package com.example.amreth_day12cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day12cw1.model.AmrethEmployee;
import com.example.amreth_day12cw1.repository.AmrethEmployeeRepo;


@Service
public class AmrethEmployeeService {
    @Autowired
    AmrethEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public AmrethEmployee setEmployee(AmrethEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AmrethEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<AmrethEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
