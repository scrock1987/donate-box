package com.jkt.donatebox.entity;

import com.jkt.donatebox.enums.Category;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Donation")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long donationId;
    private Category donationType;
    private Date donationBroadcastDate;
    private Date donationDate;
    private boolean isPrivate;
    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    public Donation() { }

    public Donation(Category donationType, Date donationBroadcastDate, Date donationDate, boolean isPrivate, User user) {
        this.donationType = donationType;
        this.donationBroadcastDate = donationBroadcastDate;
        this.donationDate = donationDate;
        this.isPrivate = isPrivate;
        this.user = user;
    }

    public Category getDonationType() {
        return donationType;
    }

    public void setDonationType(Category donationType) {
        this.donationType = donationType;
    }

    public Date getDonationBroadcastDate() {
        return donationBroadcastDate;
    }

    public void setDonationBroadcastDate(Date donationBroadcastDate) {
        this.donationBroadcastDate = donationBroadcastDate;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public Long getDonationId() {
        return donationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
