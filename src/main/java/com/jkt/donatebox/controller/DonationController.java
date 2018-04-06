package com.jkt.donatebox.controller;

import com.jkt.donatebox.entity.Donation;
import com.jkt.donatebox.entity.SuccessResponse;
import com.jkt.donatebox.entity.User;
import com.jkt.donatebox.enums.UserType;
import com.jkt.donatebox.repository.impl.DonationService;
import com.jkt.donatebox.repository.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DonationController {
    @Autowired
    private DonationService donationService;
    @Autowired
    private UserService userService;

    @GetMapping("/getDonationByUserId")
    public ResponseEntity getDonationByUserId(@RequestParam final Long userId) {
        final List<Donation> donationsByUser;
        final User userByUserId = userService.findUserByUserId(userId);
        if (UserType.DONOR.equals(userByUserId.getUserType())){
            donationsByUser = donationService.getDonationsByUser(userId);
        } else {
            donationsByUser = donationService.getDonationsByNGOUserId(userId);
        }

        return new ResponseEntity(donationsByUser, HttpStatus.OK);
    }

    @GetMapping("/isDonationStillAvailable")
    public ResponseEntity isDonationStillAvailable(@RequestParam final Long donationId) {
        final Boolean donationStillAvailable = donationService.isDonationStillAvailable(donationId);
        return new ResponseEntity(new SuccessResponse(donationStillAvailable),HttpStatus.OK);
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
