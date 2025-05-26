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

    public SelfProductService(ProductRepository productRepository,CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(long productID) throws ProductNotFoundException {

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

        // if (product.getCategory() != null) {

        //     if (product.getCategory().getId() == null) {

        //        //Create a Category first.
        //         Category category = product.getCategory();

        //         String categoryValue = category.getValue();

        //         Optional<Category> optionalCategory = categoryRepository.findByValue(categoryValue);

        //         if (optionalCategory.isEmpty()) {

        //             category = categoryRepository.save(category);
        //             product.setCategory(category);
        //         } else {
        //             product.setCategory(optionalCategory.get());
        //         }
        //     }
        // } else {
        //     throw new RuntimeException("Category can't be empty while creating a Product.");
        // }


        // Very Very Important
        // the reason we have commented above code is because it was used to save a new category which is not available before and it is being passed with the product but now we are using cascade . Presist it will automatically saved the category in case the category is compeletly new to us.
        // this cascading is used in the product model.
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
