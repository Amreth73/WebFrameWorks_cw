package com.example.amreth_day10cw1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.amreth_day10cw1.model.AmrethDoor;
import com.example.amreth_day10cw1.service.AmrethDoorService;



@RestController
public class DoorController {
    @Autowired
    AmrethDoorService doorService;
    
    @PostMapping("/api/door")
    public ResponseEntity<?> postValue(@RequestBody AmrethDoor d)
    {
        try{
           
            return ResponseEntity.status(201).body( doorService.postData(d));

        }
        catch(Exception e)
        {
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping("/api/door/bycolor/{color}")
    public ResponseEntity<?> getValue(@PathVariable String color)
    {
        return new ResponseEntity<>(doorService.getDataByColor(color),HttpStatus.OK);
    }
    @PutMapping("/api/door/{doorId}")
    public ResponseEntity<?> updatVal(@PathVariable int doorId,@RequestParam(name="color") String color)
    {
        return new ResponseEntity<>( doorService.updateData(doorId, color),HttpStatus.OK);
    }
    @DeleteMapping("/api/door/{doorId}")
    public ResponseEntity<?> delVal(@PathVariable int doorId)
    {
        return new ResponseEntity<>(doorService.deldata(doorId),HttpStatus.OK);
    }

    @GetMapping("/api/door/bydoortype")
    public ResponseEntity<?> getMethod(@RequestParam(name="doorType") String doorType)
    {
        return new ResponseEntity<>(doorService.getByType(doorType),HttpStatus.OK);
    }

    @GetMapping("/api/door")
    public ResponseEntity<?> getAllDate()
    {
       return new ResponseEntity<>(doorService.getData(),HttpStatus.OK);
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<?> getById(@PathVariable int doorId)
    {
        return new ResponseEntity<>(doorService.getById(doorId),HttpStatus.OK);
    }
}