package com.example.amreth_day15_cw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amreth_day15_cw4.model.Company;


public interface CompanyRepo extends JpaRepository<Company,Integer> {

}
