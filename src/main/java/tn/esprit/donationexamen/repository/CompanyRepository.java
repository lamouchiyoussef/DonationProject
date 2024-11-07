package tn.esprit.donationexamen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.donationexamen.entitys.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    public Company findByCompanyName(String companyName);
}
