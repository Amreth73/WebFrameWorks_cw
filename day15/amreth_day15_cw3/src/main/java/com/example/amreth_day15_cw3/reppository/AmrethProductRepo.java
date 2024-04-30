package com.example.amreth_day15_cw3.reppository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amreth_day15_cw3.model.Product;


public interface AmrethProductRepo extends JpaRepository<Product,Integer> {

}
