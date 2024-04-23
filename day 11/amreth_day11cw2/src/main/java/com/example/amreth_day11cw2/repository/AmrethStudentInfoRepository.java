package com.example.amreth_day11cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day11cw2.model.AmrethStudentInfo;


@Repository
public interface AmrethStudentInfoRepository extends JpaRepository<AmrethStudentInfo,Integer>{
    
}