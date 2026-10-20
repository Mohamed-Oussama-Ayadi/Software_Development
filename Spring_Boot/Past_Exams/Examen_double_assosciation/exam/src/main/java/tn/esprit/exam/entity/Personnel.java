package tn.esprit.exam.entity;


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
public class Personnel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nom;
    String prenom;
    int age;
    Date dateDeRecrutement;
    String login;
    String password;
    @Enumerated(EnumType.STRING)
    Poste poste;
    @ManyToOne
    Zone zone1;
    @OneToOne
    Zone zone2;

}
