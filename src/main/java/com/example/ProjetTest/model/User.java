package com.example.ProjetTest.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    private String lastname;
    private String firstname;
    private String login;
    private String mail;
    private String password;
}
