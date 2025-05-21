package com.ayush.Project1.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "categories")
public class Category extends Basemodel {

    private String vlaue;


}
