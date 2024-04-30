package com.example.amreth_day15_cw4.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Company {
    @Id
    public int companyIid;
    public String name;
    public String address;

    @OneToMany(mappedBy = "company")
    public List<Employee> employees;
}
