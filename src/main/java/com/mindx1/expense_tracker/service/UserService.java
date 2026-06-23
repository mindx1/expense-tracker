package com.mindx1.expense_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mindx1.expense_tracker.entity.User;
import com.mindx1.expense_tracker.repository.UserRepository;
import com.mindx1.expense_tracker.security.JwtUtil;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        if(userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }
        user.setPassword(
        passwordEncoder.encode(user.getPassword())
        );
        return userRepository.save(user);
    }
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    public String loginUser(String email, String password) {

        User user = userRepository.findByEmail(email)
            .orElseThrow(() -> new RuntimeException("User not found"));

        if(passwordEncoder.matches(password, user.getPassword())) {
            return JwtUtil.generateToken(user.getEmail());
        }

        throw new RuntimeException("Invalid Credentials");
    }
    

}