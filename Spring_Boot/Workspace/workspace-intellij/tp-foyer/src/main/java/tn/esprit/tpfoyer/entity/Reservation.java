package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Reservation {
    @Id

     String idReservation;
     Date anneeUniversitaire;
     Boolean estValide;
    @ToString.Exclude

    @ManyToOne
     Chambre chambre;
    @ToString.Exclude

    @ManyToMany
     List<Etudiant> etudiants;

}
