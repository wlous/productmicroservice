/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productmicroservice.resources;

import com.mycompany.productmicroservice.models.Product;
import com.mycompany.productmicroservice.services.ProductService;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author louiseahokas
 */
@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class ProductResource {
    
    ProductService productService = new ProductService();
    
    @GET
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    
    @GET
    @Path("/{productId}")//måsvinge visar att det är en inputparameter, en variabel som vi ska få från adressen
    public Product getProduct(@PathParam("productId")int id){//pathparam - vi skickar adressen som inparameter
        return productService.getProduct(id);
    }
    
    @POST
    public Product addProduct(Product product)
    {
        return productService.addProduct(product);
    }
    
    @PUT
    @Path("/{productId}")
    public Product updateProduct(@PathParam("productId")int id, Product product)
    {
    
        return productService.updateProduct(id, product);
    }
    
    @DELETE
    @Path("/{productId}")
    public Product deleteProduct(@PathParam("productId")int id){
        
        return productService.deleteProduct(id);
    }
}
