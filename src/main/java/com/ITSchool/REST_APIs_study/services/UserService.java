package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.DTOs.UserDTO;
import com.ITSchool.REST_APIs_study.models.entities.User;

import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO userDTO) throws IllegalAccessException;
    List<User> showUsers();
    List<User> deleteUser(User userToDelete);
}
