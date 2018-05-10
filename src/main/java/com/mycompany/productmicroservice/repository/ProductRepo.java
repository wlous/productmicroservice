/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productmicroservice.repository;

import com.mycompany.productmicroservice.models.Product;
import java.util.ArrayList;
import java.util.List;



//här hårdkodar vi en lista, den här ska vara singleton
public class ProductRepo {
    
    private static ProductRepo DBFakeInstance;
    
    private List<Product> products;//behövs inte deklarera players listan här eftersom det senare inte kommer att behövas kontaktas härifrån
    
    private ProductRepo(){
        
        products = new ArrayList();
        products.add(new Product(1, "Plastic cup", "http://image.com"));
        products.add(new Product(2, "Wooden cup", "http://image.com"));
        products.add(new Product(3, "Fabric cup", "http://image.com"));
        
    }
    
    public static ProductRepo getInstance(){
        if (DBFakeInstance == null){
            
            DBFakeInstance = new ProductRepo();
            
        }
            return DBFakeInstance;
            
    }

    public List<Product> getProducts() {
        return products;
    }
    
    
    
}
