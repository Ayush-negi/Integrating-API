package com.ayush.Project1.inheritance.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mcs_ta")
public class TA extends User{
    private int numberOfSessions;

}
