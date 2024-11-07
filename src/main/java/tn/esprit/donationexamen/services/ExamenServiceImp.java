package tn.esprit.donationexamen.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.donationexamen.entitys.Company;
import tn.esprit.donationexamen.entitys.Employee;
import tn.esprit.donationexamen.repository.CompanyRepository;
import tn.esprit.donationexamen.repository.DonationRepository;
import tn.esprit.donationexamen.repository.EmployeeRepository;
import tn.esprit.donationexamen.repository.RedCrescentRepository;

@AllArgsConstructor
@Service
public class ExamenServiceImp implements IExamenService {
private CompanyRepository companyRepository;
private DonationRepository donationRepository;
private EmployeeRepository employeeRepository;
private RedCrescentRepository redCrescentRepository;

    @Override
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Employee addEmployeAndAssignToCompany(Employee employe, String campanyName) {
        Company company = companyRepository.findByCompanyName(campanyName);
        employe.setCompany(company);
        return employeeRepository.save(employe);
    }
}
