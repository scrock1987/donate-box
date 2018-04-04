package com.jkt.donatebox.controller;

import com.jkt.donatebox.entity.Donation;
import com.jkt.donatebox.entity.User;
import com.jkt.donatebox.enums.Category;
import com.jkt.donatebox.enums.DonationStatus;
import com.jkt.donatebox.repository.impl.DonationService;
import com.jkt.donatebox.repository.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class DonationController {
    @Autowired
    private DonationService donationService;
    @Autowired
    private UserService userService;

    @GetMapping("/getDonationByUserId")
    public ResponseEntity getDonationByUserId(@RequestParam final Long userId) {
        /*final User user = userService.findUserByUserId(userId);
        Donation donation = new Donation(Category.FOOD, new Date(), new Date(), false,DonationStatus.AVAILABLE, user);
        donationService.saveDonation(donation);*/
        final List<Donation> donationsByUser = donationService.getDonationsByUser(userId);
        return new ResponseEntity(donationsByUser, HttpStatus.OK);
    }

    @GetMapping("/isDonationStillAvailable")
    public ResponseEntity isDonationStillAvailable(@RequestParam final Long donationId) {
        final boolean donationStillAvailable = donationService.isDonationStillAvailable(donationId);
        return new ResponseEntity(donationStillAvailable,HttpStatus.OK);
    }

    @GetMapping("/getAllDonations")
    public ResponseEntity getAllDonations() {
        final List<Donation> allDonationsAvailable = donationService.getAllDonationsAvailable();
        return new ResponseEntity(allDonationsAvailable,HttpStatus.OK);
    }

    @PostMapping("/createDonation")
    public ResponseEntity create(@RequestBody final Donation donation) {
        final Donation saveDonation = donationService.saveDonation(donation);
        return new ResponseEntity(saveDonation,HttpStatus.OK);
    }
}
