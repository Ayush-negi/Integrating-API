package com.ayush.Project1.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends Basemodel {

    private String title;
    private Double price;
    private Category category;
    private String description;
    private String image;


}
