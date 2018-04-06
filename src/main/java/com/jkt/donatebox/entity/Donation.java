package com.jkt.donatebox.entity;

import com.jkt.donatebox.enums.Category;
import com.jkt.donatebox.enums.DonationStatus;

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
    private DonationStatus donationStatus;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId",nullable = false)
    private User user;
    private Long ngoUserId;

    public Donation() { }

    public Donation(Category donationType, Date donationBroadcastDate, Date donationDate, boolean isPrivate,DonationStatus donationStatus, User user) {
        this.donationType = donationType;
        this.donationBroadcastDate = donationBroadcastDate;
        this.donationDate = donationDate;
        this.isPrivate = isPrivate;
        this.user = user;
        this.donationStatus = donationStatus;
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

    public DonationStatus getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(DonationStatus donationStatus) {
        this.donationStatus = donationStatus;
    }

    public Long getNgoUser() {
        return ngoUserId;
    }

    public void setNgoUser(Long ngoUser) {
        this.ngoUserId = ngoUser;
    }
}
