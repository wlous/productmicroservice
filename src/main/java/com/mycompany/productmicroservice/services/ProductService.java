/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productmicroservice.services;

import com.mycompany.productmicroservice.models.Product;
import com.mycompany.productmicroservice.repository.ProductRepo;
import com.mycompany.productmicroservice.repository.ProductRepository;
import java.util.List;

/**
 *
 * @author louiseahokas
 *///som Banklogic typ
public class ProductService {
    
    public List<Product> getProducts()
    {
//        ProductRepository productDB = new ProductRepository();
//        return productDB.getProducts();
        ProductRepo tm = ProductRepo.getInstance();
        return tm.getProducts();
    }
    
    public Product getProduct(int id)
    {
        
//        ProductRepository productDB = new ProductRepository();
//        return productDB.getProduct(id);
        
        ProductRepo tm = ProductRepo.getInstance();
        
        //att hämta teamlistan från databasen
        List<Product> myProducts = tm.getProducts();
        
        //att gå igenom listan och letar efter ett objekt som har id = inparameterns id.
        Product product=null;
        for(Product t:myProducts){
            if(t.getId()==id){
               product = t; 
            }
        }
        return product;
    }
    
    public Product addProduct(Product product)
    {
//        ProductRepo tm = ProductRepo.getInstance();
//        
//        //size på listan
//        //team.setId(size+1)
//        tm.getProducts().add(team);
//        return tm.getProducts();
        ProductRepository productDB = new ProductRepository();
        return productDB.addProduct(product);
    }
    
    public Product updateProduct(int id, Product product)
    {
        ProductRepository productDB = new ProductRepository();
           
        return productDB.updateProduct(id, product);
    }
    
    public Product deleteProduct(int id)
    {
        ProductRepository productDB = new ProductRepository();
        return productDB.removeProduct(id);
    }
    
    
}
