package com.example.amreth_day15_cw4.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    public int employeeId;
    public String name;
    public String position;

    @ManyToOne
    public Company company;
}
