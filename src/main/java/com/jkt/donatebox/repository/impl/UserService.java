package com.jkt.donatebox.repository.impl;

import com.jkt.donatebox.repository.UserRepository;
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

    public User saveUser(final User user) {
        return userRepository.save(user);
    }

    public User findUserByUserId(final Long userId) { return userRepository.getUserByUserId(userId);}

}
