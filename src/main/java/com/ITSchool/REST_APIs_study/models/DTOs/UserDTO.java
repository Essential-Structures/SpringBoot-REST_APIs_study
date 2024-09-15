package com.ITSchool.REST_APIs_study.models.DTOs;

import lombok.Data;

@Data
public class UserDTO {

    private Long ID;
    private String firstName, lastName, emailAddress;

}