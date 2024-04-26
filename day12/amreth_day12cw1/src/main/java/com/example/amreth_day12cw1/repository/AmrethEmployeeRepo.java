package com.example.amreth_day12cw1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.amreth_day12cw1.model.AmrethEmployee;


public interface AmrethEmployeeRepo extends JpaRepository<AmrethEmployee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<AmrethEmployee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<AmrethEmployee> getByLeftOuterEmployees();
}