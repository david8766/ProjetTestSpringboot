package com.example.ProjetTest.service;
import com.example.ProjetTest.model.User;
import com.example.ProjetTest.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserById(final Long id){
        return userRepository.findById(id);
    }

    public  Iterable<User> getUsers(){
        return userRepository.findAll();
    }

    public User createUser(User user){
        User userCreated = userRepository.save(user);
        return userCreated;
    }

    public User updateUser(User user){
        User userUpdated = userRepository.save(user);
        return userUpdated;
    }

    public void deleteUser(final Long id){
        userRepository.deleteById(id);
    }
}
