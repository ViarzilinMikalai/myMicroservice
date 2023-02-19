package com.example.service;

import com.example.domain.User;
import com.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User createUser (User user) {
        return userRepo.save(user);
    }


}
