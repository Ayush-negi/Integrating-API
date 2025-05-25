package com.ayush.Project1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ayush.Project1.repositories.CategoryRepository;
import com.ayush.Project1.repositories.ProductRepository;
import com.ayush.Project1.exceptions.ProductNotFoundException;
import com.ayush.Project1.models.Product;
import com.ayush.Project1.models.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

@Service("selfProductService")
public class SelfProductService implements Productservice{
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Override
    public Product getSingleProduct(long productID) throws ProductNotFoundException {
        // TODO Auto-generated method stub
        Optional<Product> optionalProduct = productRepository.findById(productID);


        if (optionalProduct.isEmpty()) {
            throw new ProductNotFoundException("Product with id: " + productID + " not found.");
        }

        return optionalProduct.get();
    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {

        if (product.getCategory() != null) {

            if (product.getCategory().getId() == null) {

               //Create a Category first.
                Category category = product.getCategory();

                String categoryValue = category.getValue();

                Optional<Category> optionalCategory = categoryRepository.findByValue(categoryValue);

                if (optionalCategory.isEmpty()) {

                    category = categoryRepository.save(category);
                    product.setCategory(category);
                } else {
                    product.setCategory(optionalCategory.get());
                }
            }
        } else {
            throw new RuntimeException("Category can't be empty while creating a Product.");
        }
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(long productID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }

    @Override
    public void updateProduct(long productID, Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public void replaceProduct(long productID, Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'replaceProduct'");
    }

    

}
