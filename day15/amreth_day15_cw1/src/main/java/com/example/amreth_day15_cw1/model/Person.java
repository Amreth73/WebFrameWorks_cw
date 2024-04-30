package com.example.amreth_day15_cw1.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Person {
    @Id
    public int  id;
    public String firstName;
    public String lasttName;
}
