package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.User;

import java.util.List;

public interface UserService {

    User createUser(User user) throws IllegalAccessException;
    List<User> showUsers();
    List<User> deleteUser(User userToDelete);
}
