package com.ITSchool.REST_APIs_study.models;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private UUID ID;
    private String firstName, lastName, emailAdress;

}
