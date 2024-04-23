package com.example.amreth_day11cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day11cw2.model.AmrethStudent;


@Repository
public interface AmrethStudentRepository extends JpaRepository<AmrethStudent,Integer>{
    
}
