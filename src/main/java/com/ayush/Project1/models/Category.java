package com.ayush.Project1.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
@Entity(name = "categories")
public class Category extends Basemodel {

    // @OneToMany(mappedBy = "category", cascade = CascadeType.REMOVE)   //this is to remove all the element associated with the category type in the products table
    // private List<Product> products;

    private String value;


}
