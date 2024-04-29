package com.example.amreth_day14_cw1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day14_cw1.model.AmrethPayroll;
import com.example.amreth_day14_cw1.repository.AmrethPayrollRepo;


@Service
public class AmrethPayrollService {
    @Autowired
    AmrethPayrollRepo payrollRepo;

    public AmrethPayroll addPayroll(Long id,AmrethPayroll payroll)
    {
        AmrethPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<AmrethPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
