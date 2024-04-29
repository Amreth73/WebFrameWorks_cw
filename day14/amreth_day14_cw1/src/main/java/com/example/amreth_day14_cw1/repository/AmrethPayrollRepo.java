package com.example.amreth_day14_cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day14_cw1.model.AmrethPayroll;


@Repository
public interface AmrethPayrollRepo extends JpaRepository<AmrethPayroll,Long> {
    
}
