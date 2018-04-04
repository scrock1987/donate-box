package com.jkt.donatebox.repository;

import com.jkt.donatebox.entity.Donation;
import com.jkt.donatebox.enums.DonationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Long> {
    @Query("Select d from Donation d where d.user.userId=?1")
    List<Donation> getDonationsByUser(final Long userId);

    @Query("Select d from Donation d where d.donationId=?1")
    Donation getDonationById(final Long donationId);

    @Query("Select d from Donation d where d.donationStatus=?1")
    List<Donation> getDonationsByDonationStatus(final DonationStatus donationStatus);
}
