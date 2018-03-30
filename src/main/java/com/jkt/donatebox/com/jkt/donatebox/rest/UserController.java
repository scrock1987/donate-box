package com.jkt.donatebox.com.jkt.donatebox.rest;

import com.jkt.donatebox.com.jkt.donatebox.repository.impl.UserService;
import com.jkt.donatebox.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public User getUserById() {
        return userService.findUserById("test");
    }
}
