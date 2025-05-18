package com.ayush.Project1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ayush.Project1.models.Product;
import com.ayush.Project1.services.Productservice;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/products")

public class Productcontroller {


    private Productservice productservice;

    public Productcontroller(Productservice productservice)
    {
        this.productservice = productservice;
    }


    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") long id)
    {
        return productservice.getSingleProduct(id);

    }

    @GetMapping
    public List<Product> getAllProducts(){
        return new ArrayList<>();
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
