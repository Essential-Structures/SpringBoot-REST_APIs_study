package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.User;

import java.util.List;

public interface UserService {
    public User createUser(User user) throws IllegalAccessException;
    public List<User> showUsers ();
}
