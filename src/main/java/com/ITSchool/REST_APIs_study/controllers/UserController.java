package com.ITSchool.REST_APIs_study.controllers;

import com.ITSchool.REST_APIs_study.models.DTOs.UserDTO;
import com.ITSchool.REST_APIs_study.models.entities.User;
import com.ITSchool.REST_APIs_study.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/users")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTODataReceivedToCreateUser) throws IllegalAccessException {
        return ResponseEntity.ok(userService.createUser(userDTODataReceivedToCreateUser));
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<User>> showUsers() {
        return ResponseEntity.ok(userService.showUsers());
    }

    @DeleteMapping("/api/users")
    public ResponseEntity<List<User>> deleteUser(@RequestBody User userToDelete) {
        return ResponseEntity.ok(userService.deleteUser(userToDelete));
    }
}
