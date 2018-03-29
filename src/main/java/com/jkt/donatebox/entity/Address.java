package com.jkt.donatebox.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
    private String city;
    private String state;
    private String country;
    private int pinCode;

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(final int pinCode) {
        this.pinCode = pinCode;
    }
}
