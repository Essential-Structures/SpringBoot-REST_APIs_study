package com.ITSchool.REST_APIs_study.controllers;

import com.ITSchool.REST_APIs_study.models.User;
import com.ITSchool.REST_APIs_study.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController (UserService userService){
        this.userService=userService;
    }

    @PostMapping("/api/users")
    public ResponseEntity < User > createUser(@RequestBody User userDataReceivedToCreateUser) throws IllegalAccessException {
        return ResponseEntity.ok(userService.createUser(userDataReceivedToCreateUser));
    }

    @GetMapping("/api/users")
    public ResponseEntity <List<User>> showUsers() {
        return ResponseEntity.ok(userService.showUsers());
    }
}
