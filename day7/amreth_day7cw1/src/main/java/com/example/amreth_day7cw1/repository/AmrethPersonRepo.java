package com.example.amreth_day7cw1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day7cw1.model.AmrethPerson;
import java.util.List;


@Repository
public interface AmrethPersonRepo extends JpaRepository<AmrethPerson,Integer>{

    List<AmrethPerson> findByAge(int age);
    
}
