package com.jkt.donatebox.entity;

import com.jkt.donatebox.enums.NGOType;

import javax.persistence.*;

@Entity
@Table(name = "NGO")
public class NGO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ngoId;
    private String name;
    private NGOType type;
    private String registrationNumber;
    private String coordinatorName;
    private String email;
    private String website;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "addressId")
    private Address address;
    private int rating;

    public NGO() { }

    public NGO(String name, NGOType type, String registrationNumber, String coordinatorName, String email, String website, Address address, int rating) {
        this.name = name;
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.coordinatorName = coordinatorName;
        this.email = email;
        this.website = website;
        this.address = address;
        this.rating = rating;
    }

    public Long getNgoId() {
        return ngoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NGOType getType() {
        return type;
    }

    public void setType(NGOType type) {
        this.type = type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCoordinatorName() {
        return coordinatorName;
    }

    public void setCoordinatorName(String coordinatorName) {
        this.coordinatorName = coordinatorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
