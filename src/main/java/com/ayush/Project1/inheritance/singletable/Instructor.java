package com.ayush.Project1.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value ="1")
public class Instructor extends User{

    private String specialization;
    private double avgRating;


}
