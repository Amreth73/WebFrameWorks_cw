package com.example.amreth_day12cw1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Service;

import com.example.amreth_day12cw1.repository.AmrethAddressRepo;
import com.example.amreth_day12cw1.repository.AmrethEmployeeRepo;


@Service
public class AmrethAddressService {
    @Autowired
    AmrethAddressRepo addressRepo;
    @Autowired
    AmrethEmployeeRepo employeeRepo;
    public Address setAddressById(int id,Address address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
