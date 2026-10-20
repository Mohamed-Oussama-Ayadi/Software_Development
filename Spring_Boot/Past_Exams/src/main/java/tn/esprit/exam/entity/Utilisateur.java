package tn.esprit.exam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long usrId;

    String usrNom;
    Date usrDateInscription;

    @Enumerated(EnumType.STRING)
    Profession profession;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Programme> programmes;

}
