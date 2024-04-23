package com.example.amreth_day10cw2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amreth_day10cw2.model.AmrethCustomer;
import com.example.amreth_day10cw2.repository.AmrethCustomerRepo;

import java.util.List;
import java.util.Optional;


@Service
public class AmrethCustomerService {
    @Autowired
    AmrethCustomerRepo customerRepo;
    public AmrethCustomer postData(AmrethCustomer c)
    {
        return customerRepo.save(c);
    }
    public List<AmrethCustomer> getByCity(String city)
    {
        return customerRepo.findByCity(city);
    }
    public List<AmrethCustomer> getData()
    {
        return customerRepo.findAll();
    }
    public Optional<AmrethCustomer> getById(int id){
        return customerRepo.findById(id);
    }
    public AmrethCustomer updateData(int id,int pincode)
    {
        AmrethCustomer exist=customerRepo.findById(id).orElse(null);
        if(exist!=null)
        {
            exist.setPincode(pincode);
            return customerRepo.saveAndFlush(exist);

        }
        else
         return null;
    }
    public String deleteData(int id)
    {
        customerRepo.deleteById(id);
        return ("Customer deleted successfully.");
    }

}
