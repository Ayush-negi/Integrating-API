package com.ayush.Project1.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="products")
public class Product extends Basemodel {

    private String title;
    private Double price;
    @ManyToOne(cascade = CascadeType.PERSIST) // this is to save the internal object also if we are saving the exteranl object mean if category is completely new it will also get saved in the category table with the product associated with it.
    private Category category;
    private String description;
    private String image;


}
