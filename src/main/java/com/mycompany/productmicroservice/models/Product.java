/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productmicroservice.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity

public class Product implements Serializable{
    
    @Id@GeneratedValue
    int id;
    String productName;
    String productImageUrl;
        
    public Product (){}//default constructor
    
    public Product (int id, String productName, String productImageUrl){
        this.id = id;
        this.productName = productName;
        this.productImageUrl = productImageUrl; 
    }

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
    
    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }
}
