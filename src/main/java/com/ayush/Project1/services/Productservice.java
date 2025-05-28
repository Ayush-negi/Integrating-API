package com.ayush.Project1.services;

import java.util.ArrayList;
import java.util.List;

import com.ayush.Project1.exceptions.ProductNotFoundException;
import com.ayush.Project1.models.Product;

// this is the interface class and it is implemented by fakestoreProductService and SelfProductService.
public interface Productservice {

    Product getSingleProduct(long productID) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product createProduct(Product product);

    void deleteProduct(long productID);

    void updateProduct(long productID, Product product);

    void replaceProduct(long productID, Product product);


}
