package com.example.amreth_day12cw2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.amreth_day12cw2.model.AmrethStudent;
@Repository
public interface AmrethStudentRepository extends JpaRepository<AmrethStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<AmrethStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<AmrethStudent> getStudentsLeftOuter();

    

    
}
