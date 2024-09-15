package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.DTOs.UserDTO;
import com.ITSchool.REST_APIs_study.models.entities.UserForDatabase;

import java.util.List;

public interface UserService {

    UserDTO createUserInsideDatabase(UserDTO userDTO) throws IllegalArgumentException;
    List<UserForDatabase> showUsers();
    List<UserForDatabase> deleteUser(UserForDatabase userToDelete);
}
