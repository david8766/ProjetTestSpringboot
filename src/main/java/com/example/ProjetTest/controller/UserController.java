package com.example.ProjetTest.controller;

import com.example.ProjetTest.model.User;
import com.example.ProjetTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rest/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") Long id) {
        return this.userService.getUserById(id);
    }

    @GetMapping
    public Iterable<User> findAll() {
        return this.userService.getUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        System.out.println(user.toString());
        return this.userService.createUser(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return this.userService.updateUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        this.userService.deleteUser(id);
    }
}
