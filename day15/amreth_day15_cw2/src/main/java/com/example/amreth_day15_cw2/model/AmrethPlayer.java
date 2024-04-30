package com.example.amreth_day15_cw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AmrethPlayer {
    @Id
    public int id;

    public String playerName;
    public String team;
    public int age;
}
