package com.example.content_planner.controller;

import com.example.content_planner.model.User;
import com.example.content_planner.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    // get all Users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    // Create user rest API
    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }

}

