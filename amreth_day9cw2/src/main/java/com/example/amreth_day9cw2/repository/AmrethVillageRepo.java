package com.example.amreth_day9cw2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.amreth_day9cw2.modal.AmrethVillage;

import java.util.List;

@Repository
public interface AmrethVillageRepo extends JpaRepository<AmrethVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    AmrethVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    AmrethVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<AmrethVillage> findByPopulation(int population);

}
