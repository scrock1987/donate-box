package com.jkt.donatebox.com.jkt.donatebox.repository.impl;

import com.jkt.donatebox.com.jkt.donatebox.repository.UserRepository;
import com.jkt.donatebox.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findUserById(final String email) {
       return userRepository.getUserByEmail(email);
    }

}
