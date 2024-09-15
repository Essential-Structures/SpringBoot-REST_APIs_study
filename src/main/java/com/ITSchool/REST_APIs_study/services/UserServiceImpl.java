package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.DTOs.UserDTO;
import com.ITSchool.REST_APIs_study.models.entities.UserForDatabase;
import com.ITSchool.REST_APIs_study.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    private final ObjectMapper objectMapper;

    public UserServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public UserDTO createUserInsideDatabase(UserDTO userDTO)
            throws IllegalArgumentException {

        if(userDTO.getEmailAddress().length()<5)
            throw new IllegalArgumentException("EMail address invalid");

        UserForDatabase userEntityForDatabase = objectMapper.convertValue(userDTO, UserForDatabase.class);
        UserForDatabase savedUserEntity=userRepository.save(userEntityForDatabase);
        log.info("Just save user with ID {} to database",savedUserEntity.getID());
        return objectMapper.convertValue(savedUserEntity,UserDTO.class);
    }

    @Override
    public List<UserForDatabase> showUsers() {
        return null;
    }

    @Override
    public List<UserForDatabase> deleteUser(UserForDatabase userToDelete) {
        //users.remove(userToDelete);
        return null;
    }
}
