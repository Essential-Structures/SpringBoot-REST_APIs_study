package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.DTOs.UserDTO;
import com.ITSchool.REST_APIs_study.models.entities.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();


    @Override
    public UserDTO createUser(UserDTO userDTO) throws IllegalAccessException {
        return null;
    }

    @Override
    public List<User> showUsers() {
        return users;
    }

    @Override
    public List<User> deleteUser(User userToDelete) {
        users.remove(userToDelete);
        return users;
    }
}
