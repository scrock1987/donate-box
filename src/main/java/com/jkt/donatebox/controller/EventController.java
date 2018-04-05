package com.jkt.donatebox.controller;

import com.jkt.donatebox.entity.Event;
import com.jkt.donatebox.repository.impl.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/getAllEvents")
    public ResponseEntity getAllEvents() {
        final List<Event> allEvents = eventService.getAllEvents();
        return new ResponseEntity(allEvents, HttpStatus.OK);
    }
}
