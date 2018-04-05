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
public class EventControllerTest {

    @Autowired
    private EventController eventController;

    @Test
    public void getAllEvents() throws Exception {
        final ResponseEntity allEvents = eventController.getAllEvents();
        Assert.assertNotNull(allEvents);
    }

}