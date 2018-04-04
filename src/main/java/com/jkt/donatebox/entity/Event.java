package com.jkt.donatebox.entity;

import com.jkt.donatebox.enums.Category;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;
    @OneToOne
    @JoinColumn(name = "ngoId")
    private NGO ngo;
    private Date fromDate;
    private Date toDate;
    private String time;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "addressId")
    private Address address;
    private Category eventType;

    public Event() { }

    public Event(NGO ngo, Date fromDate, Date toDate, String time, Address address, Category eventType) {
        this.ngo = ngo;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.time = time;
        this.address = address;
        this.eventType = eventType;
    }

    public Long getEventId() {
        return eventId;
    }

    public NGO getNgo() {
        return ngo;
    }

    public void setNgo(NGO ngo) {
        this.ngo = ngo;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Category getEventType() {
        return eventType;
    }

    public void setEventType(Category eventType) {
        this.eventType = eventType;
    }
}
