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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
