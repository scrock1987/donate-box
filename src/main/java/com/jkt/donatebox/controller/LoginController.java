package com.jkt.donatebox.controller;

import com.google.common.base.Preconditions;
import com.jkt.donatebox.entity.User;
import com.jkt.donatebox.repository.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public ResponseEntity loginUser(@RequestParam String email, @RequestParam String password) {
        final HttpStatus httpStatus;
        Preconditions.checkNotNull(email,"Email cannot be null");
        Preconditions.checkNotNull(password,"password cannot be null");
        final User dbUser = userService.findUserById(email);
        if (dbUser!=null && password.equals(dbUser.getPassword())) {
            httpStatus = HttpStatus.OK;
        } else {
            httpStatus = HttpStatus.UNAUTHORIZED;
        }
        return new ResponseEntity(dbUser,httpStatus);
    }
}
