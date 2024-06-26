package com.example.amreth_day7cw2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day7cw2.model.AmrethCourse;

import java.util.List;


@Repository
public interface AmrethCourseRepo extends JpaRepository<AmrethCourse,Integer>{

    List<AmrethCourse> findByCourseName(String courseName);
    
}
