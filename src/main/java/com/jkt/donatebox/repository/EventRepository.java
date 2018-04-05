package com.jkt.donatebox.repository;

import com.jkt.donatebox.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    @Query("Select e from Event e")
    List<Event> getAllEvents();
}
