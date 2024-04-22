package com.example.amreth_day8cw2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AmrethProduct {
    @Id
    private int id;
    private String productName;
    private int price;
    private String category;
    
    public AmrethProduct(int id, String productName, int price, String category) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }
    public AmrethProduct(){}


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getProductName() {
        return productName;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
}
