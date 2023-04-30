package com.example.content_planner.controller;

import com.example.content_planner.exception.ResourceNotFoundException;
import com.example.content_planner.model.Posts;
import com.example.content_planner.model.User;
import com.example.content_planner.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    // get user by id rest api
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User does not exist with id :" + id));
        return ResponseEntity.ok(user);
    }

    // update post rest api
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails){
        User user = userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id :" + id));

        user.setUserName(userDetails.getUserName());
        user.setEmail(userDetails.getEmail());
        user.setfName(userDetails.getfName());
        user.setlName(userDetails.getlName());
        user.setAboutMe(userDetails.getAboutMe());

        User updatedUser = userRepo.save(user);
        return ResponseEntity.ok(updatedUser);
    }

}

