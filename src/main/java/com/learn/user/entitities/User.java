package com.learn.user.entitities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "micro_users")
public class User {

    @Id
    private String userId;
    @Column(length = 15)
    private String name;
    @Column(unique = true)
    private String email;
    private String about;
    @Transient
    List<Rating> ratings = new ArrayList<>();

}
