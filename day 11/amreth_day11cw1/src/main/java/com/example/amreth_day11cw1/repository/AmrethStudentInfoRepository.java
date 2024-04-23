package com.example.amreth_day11cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day11cw1.modal.AmrethStudentInfo;


@Repository
public interface AmrethStudentInfoRepository extends JpaRepository<AmrethStudentInfo,Integer>{
    
}