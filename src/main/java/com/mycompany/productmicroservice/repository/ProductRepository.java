/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productmicroservice.repository;

import com.mycompany.productmicroservice.models.Product;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author louiseahokas
 */
public class ProductRepository {
    
    public List<Product> getProducts()
    {
        Session session = HibernateUtil.getSession();
        //behöver inte transaktion när det är get
        List <Product> products = session.createCriteria(Product.class).list();

        session.close();
        return products;
    }
    
    public Product addProduct(Product product)
    {
        Session session= HibernateUtil.getSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        session.close();
        return product;
    }
    
    public Product getProduct(int id)
    {
        Session session= HibernateUtil.getSession();
        Product team = (Product)session.get(Product.class, id);
        session.close();
        return team;
    }    
    public Product removeProduct(int id)
    {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Product t = new Product();
        t.setId(id);
        session.delete(t);
        session.getTransaction().commit();
        session.close();
        return t;
    }
    
    public Product updateProduct(int id, Product product)
    {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        
        Product newProduct = (Product)session.get(Product.class, id);
        
        newProduct.setProductImageUrl(product.getProductImageUrl());
        newProduct.setProductName(product.getProductName());
        
        session.update(newProduct);
        
        session.getTransaction().commit();
        session.close();
        return product;
    }   
    
}
