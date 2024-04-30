package com.example.amreth_day15_cw4.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day15_cw4.model.Company;
import com.example.amreth_day15_cw4.repository.CompanyRepo;


@Service
public class CompayService {
    @Autowired
    public CompanyRepo companyRepo;

    public Company postData(Company p){
        return companyRepo.save(p);
    }

    public Company getOneData(int id){
        return companyRepo.findById(id).orElseThrow();
    }

    public List<Company> getData(){
        return companyRepo.findAll();
    }

    public void deleteData(int id){
        companyRepo.deleteById(id);
    }

    public Company putData(int id,Company p){
        Company pr=companyRepo.findById(id).orElseThrow();
        pr.setName(p.getName());
        pr.setAddress(p.getAddress());
        pr.setEmployees(pr.getEmployees());
        return companyRepo.save(pr);
    }
}
