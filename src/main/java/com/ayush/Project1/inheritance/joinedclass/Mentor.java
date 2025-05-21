package com.ayush.Project1.inheritance.joinedclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_mentor")
//@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    private String company;
}
