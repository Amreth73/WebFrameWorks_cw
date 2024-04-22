package com.example.springapp.ClassExerciseDay8.exercise3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.ClassExerciseDay8.exercise3.model.AmrethStudent;
import java.util.List;


@Repository
public interface AmrethStudentRepo extends JpaRepository<AmrethStudent,Integer>{

    List<AmrethStudent> findByMarksGreaterThan(int marks); 
    List<AmrethStudent> findByMarksLessThan(int marks); 
}
