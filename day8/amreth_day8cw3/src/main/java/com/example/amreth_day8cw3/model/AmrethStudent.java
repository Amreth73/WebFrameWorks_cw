package com.example.amreth_day8cw3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AmrethStudent {
    @Id
    private int id;
    private String name;
    private int marks;

    public AmrethStudent() {
    }

    public AmrethStudent(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
