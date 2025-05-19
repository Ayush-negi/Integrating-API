package com.ayush.Project1.services;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

import com.ayush.Project1.dtos.fakeStoreProductDTO;
import com.ayush.Project1.models.Category;
import com.ayush.Project1.models.Product;
import com.ayush.Project1.exceptions.ProductNotFoundException;

@Service
public class fakeStoreProductService implements Productservice{


    private RestTemplate restTemplate;

    public fakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    
    }

    public Product getSingleProduct(long productID) throws ProductNotFoundException
    {
        //RestTemplate restTemplate = new RestTemplate();  // now we have introduced a beam and we are declaring only one resttemplate object to avoid duplication. this is part of upgradeation.

    //     fakeStoreProductDTO fakeStoreProductDTO = restTemplate.getForObject(
    //         "https://fakestoreapi.com/products/" + productID, 
    //         fakeStoreProductDTO.class //deserialization converting json object to java object

    //     );
    //     return convertFakeStoreProductDtoToProduct(fakeStoreProductDTO);
            throw new ProductNotFoundException("Something went wrong");
    }

    public List<Product> getAllProducts(){

        fakeStoreProductDTO[] fakeStoreProductDTOs = restTemplate.getForObject(
            "https://fakestoreapi.com/products", 
            fakeStoreProductDTO[].class //deserialization converting json object to java object

        );
        List<Product> products = new ArrayList<>();
        for(fakeStoreProductDTO fakeStoreProductDTO: fakeStoreProductDTOs)
        {
            products.add(convertFakeStoreProductDtoToProduct(fakeStoreProductDTO));
        }

        return products;
    }

    public Product createProduct(Product product){
        return null;
    }

    public void deleteProduct(long productID){
        
    }

    public void updateProduct(long productID, Product product){

    }

    public void replaceProduct(long productID, Product product){

    }

    private Product convertFakeStoreProductDtoToProduct(fakeStoreProductDTO fakeStoreProductDTO)
    {
        Product product = new Product();
        product.setCategory(new Category());
        product.setId(fakeStoreProductDTO.getId());
        product.setTitle(fakeStoreProductDTO.getTitle());
        product.setDescription(fakeStoreProductDTO.getDescription());
        product.setImage(fakeStoreProductDTO.getImage());
        product.setTitle(fakeStoreProductDTO.getTitle());
        product.getCategory().setVlaue(fakeStoreProductDTO.getCategory());

        return product;

    }

}
