package tn.esprit.tp8salmadamak4erpbi4.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProjetDetail;
    String description;
    String technologies;
    Long cout;
    Date dateDebut;
    @ToString.Exclude
    @OneToOne(mappedBy = "projetDetail")
    Projet projet;
}
