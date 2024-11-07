package tn.esprit.donationexamen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.donationexamen.entitys.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
