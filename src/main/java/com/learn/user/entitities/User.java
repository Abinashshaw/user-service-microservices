package com.learn.user.entitities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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


}
