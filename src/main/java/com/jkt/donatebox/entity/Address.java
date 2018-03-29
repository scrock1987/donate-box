package com.jkt.donatebox.entity;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String city;
    private String state;
    private String country;
    private int pinCode;

    public int getAddressId() {
        return addressId;
    }

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

    public Address(final String city, final String state, final String country, final int pinCode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}
