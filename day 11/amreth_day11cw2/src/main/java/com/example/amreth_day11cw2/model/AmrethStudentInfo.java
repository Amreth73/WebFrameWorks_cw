package com.example.amreth_day11cw2.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AmrethStudentInfo {
    @Id
    private int id;
    private String address;
    private String phNo;
}
