package tn.esprit.examen.nomPrenomClasseExamen.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Candidat {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int idCandidat;
    String nom;
    String prenom;
    int nbQuiz;
    @Enumerated(EnumType.STRING)
    Niveau niveau;
    @ManyToMany(mappedBy="candidats", cascade = CascadeType.ALL)
    private List<Quiz> Quizs;

}
