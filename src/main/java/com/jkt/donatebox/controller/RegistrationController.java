package com.jkt.donatebox.controller;

import com.google.common.base.Preconditions;
import com.jkt.donatebox.entity.User;
import com.jkt.donatebox.repository.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity registerUser(@RequestBody final User user) {
        Preconditions.checkNotNull(user,"User Must not be null");
        userService.saveUser(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }
}
