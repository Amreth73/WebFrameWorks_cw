package com.example.amreth_day9cw1.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.amreth_day9cw1.model.AmrethPerson;


public interface AmrethPersonRepo extends JpaRepository<AmrethPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<AmrethPerson> findByAge(int age);
}
