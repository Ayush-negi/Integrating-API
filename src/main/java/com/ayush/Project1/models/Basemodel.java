package com.ayush.Project1.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
// this is the base class all the models will inherit it.
@Getter
@Setter
@MappedSuperclass
public class Basemodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this is for auto incrementing the ID
    private Long id;
    private Long createdAt;
    private Long lastUpdatedAt;
    

}
