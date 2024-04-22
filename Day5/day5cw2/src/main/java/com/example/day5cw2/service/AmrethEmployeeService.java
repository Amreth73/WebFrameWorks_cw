package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.controller.Employee;
import com.example.day5cw2.model.AmrethEmployee;
import com.example.day5cw2.repository.AmrethEmployeeRepo;

@Service
public class AmrethEmployeeService {
    public AmrethEmployeeRepo employeeRepo;
    public AmrethEmployeeService(AmrethEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean AmrethEmployeeService(Employee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Employee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public AmrethEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
    public boolean saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveEmployee'");
    }
}
