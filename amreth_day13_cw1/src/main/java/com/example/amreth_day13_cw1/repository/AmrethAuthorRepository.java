package com.example.amreth_day13_cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.amreth_day13_cw1.model.AmrethAuthor;

@Repository
public interface AmrethAuthorRepository extends JpaRepository<AmrethAuthor, Long> {
}
