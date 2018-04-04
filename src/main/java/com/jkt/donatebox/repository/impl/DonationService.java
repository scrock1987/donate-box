package com.jkt.donatebox.repository.impl;

import com.jkt.donatebox.entity.Donation;
import com.jkt.donatebox.enums.DonationStatus;
import com.jkt.donatebox.repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {
    @Autowired
    private DonationRepository donationRepository;

    public List<Donation> getDonationsByUser(final Long userId) {
        return donationRepository.getDonationsByUser(userId);
    }

    public boolean isDonationStillAvailable(final Long donationId) {
        final Donation donationById = donationRepository.getDonationById(donationId);
        return DonationStatus.AVAILABLE.equals(donationById.getDonationStatus());
    }

    public List<Donation> getAllDonationsAvailable() {
        return donationRepository.getDonationsByDonationStatus(DonationStatus.AVAILABLE);
    }

    public Donation saveDonation(final Donation donation) {
        return donationRepository.save(donation);
    }
}
