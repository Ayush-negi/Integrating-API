package com.ayush.Project1.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ayush.Project1.models.Product;
import com.ayush.Project1.repositories.projections.ProductWithTitleAndPrice;

import java.util.Optional;
import java.util.List;


import com.ayush.Project1.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

    @Override
    Optional<Product> findById(Long productId);

    @Override
    List<Product> findAll();
    

    Product save(Product product);

    @Query("select p.title as title, p.price as price from products p")
    List<ProductWithTitleAndPrice> getTitleAndPriceById();

}
