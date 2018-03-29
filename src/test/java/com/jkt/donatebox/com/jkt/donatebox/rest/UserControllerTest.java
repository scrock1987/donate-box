package com.jkt.donatebox.com.jkt.donatebox.rest;

import com.jkt.donatebox.com.jkt.donatebox.repository.impl.UserService;
import com.jkt.donatebox.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Autowired
    UserController userController;

    @Test
    public void getUsers() throws Exception {
        final User userById = userController.getUserById();
        Assert.assertNotNull(userById);
    }

}