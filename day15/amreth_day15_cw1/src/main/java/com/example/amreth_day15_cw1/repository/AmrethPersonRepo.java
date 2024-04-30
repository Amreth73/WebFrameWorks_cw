package com.example.amreth_day15_cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amreth_day15_cw1.model.Person;


public interface AmrethPersonRepo extends JpaRepository<Person,Integer> {

}
