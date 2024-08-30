package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.User;
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
    public User createUser(User utilizatorCreat) throws IllegalAccessException {
        if (utilizatorCreat.getEmailAdress().length()<5)
            throw new IllegalAccessException("Inputed user data is invalid");

            users.add(utilizatorCreat);
            utilizatorCreat.setID(UUID.randomUUID());
            log.info("User {} successfully added to database", utilizatorCreat.getID());
        return utilizatorCreat;
    }

    @Override
    public List<User> showUsers() {
        return users;
    }
}
