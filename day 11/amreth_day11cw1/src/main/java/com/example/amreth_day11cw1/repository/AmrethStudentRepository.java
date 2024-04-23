package com.example.amreth_day11cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day11cw1.modal.AmrethStudent;



@Repository
public interface AmrethStudentRepository extends JpaRepository<AmrethStudent,Integer>{
    
}
