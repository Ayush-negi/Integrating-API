package com.ayush.Project1.services;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.*;

import com.ayush.Project1.dtos.fakeStoreProductDTO;
import com.ayush.Project1.models.Category;
import com.ayush.Project1.models.Product;

@Service
public class fakeStoreProductService implements Productservice{

    public Product getSingleProduct(long productID){
        RestTemplate restTemplate = new RestTemplate();

        fakeStoreProductDTO fakeStoreProductDTO = restTemplate.getForObject(
            "https://fakestoreapi.com/products/" + productID, 
            fakeStoreProductDTO.class //deserialization converting json object to java object

        );
        return convertFakeStoreProductDtoToProduct(fakeStoreProductDTO);
    }

    public List<Product> getAllProducts(){
        return null;
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
