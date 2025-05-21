package com.ayush.Project1.inheritance.joinedclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_ta")
//@PrimaryKeyJoinColumn(name = "user_id")
public class TA extends User{
    private int numberOfSessions;

}
