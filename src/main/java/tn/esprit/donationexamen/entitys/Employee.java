package tn.esprit.donationexamen.entitys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Employee implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    private String firstName;

    private String lastName;

    private String position;

    @ManyToOne
    @JsonIgnore
    private Company company;

    @OneToMany(mappedBy = "employee")
    private List<Donation> donations;
}
