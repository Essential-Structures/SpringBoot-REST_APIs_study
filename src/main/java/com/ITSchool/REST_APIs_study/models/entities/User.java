package com.ITSchool.REST_APIs_study.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "prenume")
    private String firstName;
    @Column(name = "nume")
    private String lastName;
    @Column(name = "emil")
    private String emailAddress;

}
