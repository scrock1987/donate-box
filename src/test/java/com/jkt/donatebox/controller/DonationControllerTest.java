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
public class DonationControllerTest {

    @Autowired
    private DonationController donationController;

    @Test
    public void getDonationByUserId() throws Exception {
        final ResponseEntity responseEntity = donationController.getDonationByUserId(1L);
        Assert.assertNotNull(responseEntity);
    }
}