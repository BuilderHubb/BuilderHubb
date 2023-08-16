package com.BuilderHub.App.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Entity
@Data
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "username")
    private String username;
    @Column(name = "projectList")
    //Need to create model "ProjectList" and add here
    private List projectLists;
    @Column(name = "role")
    private Role role;
    @Column(name = "rating")
    private Double rating;
}
