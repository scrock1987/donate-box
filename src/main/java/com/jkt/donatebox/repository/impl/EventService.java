package com.jkt.donatebox.repository.impl;

import com.jkt.donatebox.entity.Event;
import com.jkt.donatebox.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.getAllEvents();
    }

    public Event save(final Event event) {
        return eventRepository.save(event);
    }
}
