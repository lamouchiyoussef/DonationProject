package tn.esprit.donationexamen.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.donationexamen.entitys.Company;
import tn.esprit.donationexamen.entitys.Employee;
import tn.esprit.donationexamen.services.IExamenService;

@AllArgsConstructor
@RestController
public class ExamenRestController {

    private IExamenService examenService;
@PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company company){
        return examenService.addCompany(company);
    }
@PostMapping("/addEmployeAndAssignToCompany/{campanyName}")
    public Employee addEmployeAndAssignToCompany(
            @RequestBody Employee employe,
            @PathVariable String campanyName){
    return examenService.addEmployeAndAssignToCompany(
            employe,
            campanyName);
    }
}
