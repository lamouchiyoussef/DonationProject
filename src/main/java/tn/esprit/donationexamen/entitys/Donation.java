package tn.esprit.donationexamen.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Donation implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDone;

    private Float ameunt;

@Temporal(TemporalType.DATE)
    private Date date;

@Enumerated(EnumType.STRING)
    private DonationType donationType;

@ManyToOne
private Employee employee;
}
