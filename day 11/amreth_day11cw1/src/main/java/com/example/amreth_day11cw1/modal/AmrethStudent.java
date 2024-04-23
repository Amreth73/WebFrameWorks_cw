package com.example.amreth_day11cw1.modal;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class AmrethStudent {
    @Id
    private int id;
    private String name;

    @JsonManagedReference
    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    private AmrethStudentInfo studentInfo;
}