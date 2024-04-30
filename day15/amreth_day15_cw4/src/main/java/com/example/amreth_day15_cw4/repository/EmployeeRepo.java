package com.example.amreth_day15_cw4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amreth_day15_cw4.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
