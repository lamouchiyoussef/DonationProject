package tn.esprit.donationexamen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.donationexamen.entitys.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
