package com.example.amreth_day8cw2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day8cw2.model.AmrethProduct;

import java.util.List;


@Repository
public interface AmrethProductRepo extends JpaRepository<AmrethProduct,Integer>{

    List<AmrethProduct> findByProductNameStartingWith(String name);
    List<AmrethProduct> findByProductNameEndingWith(String name);
    
}
