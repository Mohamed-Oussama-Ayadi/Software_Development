package tn.esprit.exam.entity;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Projet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identifiant projet (Clé primaire)

    private String sujet;


    @Enumerated(EnumType.STRING)
    private Domaine domaine;

}
