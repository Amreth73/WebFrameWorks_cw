package com.example.amreth_day10cw1.model;

import jakarta.persistence.*;;

@Entity
@Table(name = "Doors")
public class AmrethDoor {
    @Id
   
    public int doorId;

    public String doorType;
    public String material;
    public String color;
    public int price;
    public int getDoorId() {
        return doorId;
    }
    public void setDoorId(int doorId) {
        this.doorId = doorId;
    }
    public String getDoorType() {
        return doorType;
    }
    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}
