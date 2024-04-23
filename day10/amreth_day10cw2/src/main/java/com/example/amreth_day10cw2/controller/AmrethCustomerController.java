package com.example.amreth_day10cw2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day10cw2.model.AmrethCustomer;
import com.example.amreth_day10cw2.service.AmrethCustomerService;


@RestController
public class AmrethCustomerController {
    @Autowired
    AmrethCustomerService customerService;
    @PostMapping("/api/customer")
    public ResponseEntity<?> postval(@RequestBody AmrethCustomer c)
    {
        try{
           
            return ResponseEntity.status(201).body(customerService.postData(c));
        }
        catch(Exception e)
        {
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping("/api/customer/bycity/{city}")
    public ResponseEntity<?> getvalcity(@PathVariable String city)
    {
        return new ResponseEntity<>(customerService.getByCity(city),HttpStatus.OK);
    }

    @GetMapping("/api/customer")
    public ResponseEntity<?> getval()
    {
        return new ResponseEntity<>(customerService.getData(),HttpStatus.OK);
    }
    @GetMapping("/api/customer/{customerId}")
    public ResponseEntity<?> getByid(@PathVariable int customerId)
    {
        return new ResponseEntity<>(customerService.getById(customerId),HttpStatus.OK);
    }

    @PutMapping("/api/customer/{customerId}/{pincode}")
    public ResponseEntity<?> updateval(@PathVariable int customerId,@PathVariable int pincode)
    {
        return new ResponseEntity<>(customerService.updateData(customerId, pincode),HttpStatus.OK);
    }

    @DeleteMapping("/api/customer/{customerId}")
    public ResponseEntity<?> delval(@PathVariable int customerId)
    {
        return new ResponseEntity<>(customerService.deleteData(customerId),HttpStatus.OK);
    }

}
