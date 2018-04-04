package com.jkt.donatebox.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginControllerTest {

    @Autowired
    private LoginController loginController;

    @Test
    public void getUsers() throws Exception {
        final ResponseEntity response = loginController.loginUser("saurabh.chawla@jktech.com", "password");
        Assert.assertNotNull(response);
    }

}