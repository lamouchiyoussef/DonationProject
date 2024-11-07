package tn.esprit.donationexamen.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Company implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;

    @Column(nullable = false)
    private String companyName;

    private String address;

    @OneToMany(mappedBy = "company")
    private List<Employee> employees;
}
