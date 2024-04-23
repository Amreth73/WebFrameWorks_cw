package com.example.amreth_day10cw2.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day10cw2.model.AmrethCustomer;


@Repository
public interface AmrethCustomerRepo extends JpaRepository<AmrethCustomer,Integer> {

    List<AmrethCustomer> findByCity(String City);
    
}