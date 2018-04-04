package com.jkt.donatebox.controller;

import com.jkt.donatebox.enums.NGOType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class NGOControllerTest {

    @Autowired
    NGOController ngoController;

    @Test
    public void getNgoByCity() throws Exception {
        final ResponseEntity responseEntity = ngoController.getNgoByCity("Delhi", NGOType.OLD_AGE_HOME);
        Assert.assertNotNull(responseEntity);
    }

}