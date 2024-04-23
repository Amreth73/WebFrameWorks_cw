package com.example.amreth_day10cw1.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day10cw1.model.AmrethDoor;

@Repository
public interface AmrethDoorRepo extends JpaRepository<AmrethDoor,Integer> {
   


    
    List<AmrethDoor>findByColor(String color);


    List<AmrethDoor>findByDoorType(String doorType);

   
    List<AmrethDoor>findByDoorId(int doorId);

   

   

    
}