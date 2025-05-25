package com.ayush.Project1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ayush.Project1.models.Product;
import com.ayush.Project1.services.Productservice;
import com.ayush.Project1.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.ayush.Project1.exceptions.ProductNotFoundException;
import com.ayush.Project1.services.Productservice;
import com.ayush.Project1.models.Product;


@RestController
@RequestMapping("/products")

public class Productcontroller 
{


    private Productservice productservice;

    public Productcontroller(@Qualifier("selfProductService") Productservice productservice)
    {
        this.productservice = productservice;
    }


    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") long id) throws ProductNotFoundException
    {

        // try{
        //     return new ResponseEntity<>(productservice.getSingleProduct(id) , HttpStatus.OK);
        // }
        // catch(RuntimeException e){
        //     return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        // }
        Product product = productservice.getSingleProduct(id);
        return product;

    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productservice.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {

        return new Product();
    }
    

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") long id) {


    }

    @PatchMapping("/{id}") // partial update of the product
    public void updateProduct(@PathVariable("id") long id, @RequestBody Product product) {

    }

    @PutMapping("/{id}") // replace the entire product
    public void replaceProduct(@PathVariable("id") long id, @RequestBody Product product)
    {

    }


}
