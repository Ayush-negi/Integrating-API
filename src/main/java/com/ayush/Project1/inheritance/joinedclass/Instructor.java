package com.ayush.Project1.inheritance.joinedclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_instructor")
//@PrimaryKeyJoinColumn(name = "user_id")
public class Instructor extends User{

    private String specialization;
    private double avgRating;


}
