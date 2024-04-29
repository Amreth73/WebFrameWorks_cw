package com.example.amreth_day14_cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day14_cw2.model.AmrethBook;


@Repository
public interface AmrethBookRepo extends JpaRepository<AmrethBook,Integer> {
    
}
