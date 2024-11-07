package tn.esprit.donationexamen.services;

import tn.esprit.donationexamen.entitys.Company;
import tn.esprit.donationexamen.entitys.Employee;

public interface IExamenService {

    public Company addCompany(Company company );
    public Employee addEmployeAndAssignToCompany
            (Employee employe,
             String campanyName);
}
