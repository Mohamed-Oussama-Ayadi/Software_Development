package tn.esprit.examen.nomPrenomClasseExamen.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int idQuiz;
    String titreQuiz;
    String specialite;
    Date dateQuiz;
    @OneToMany(cascade=CascadeType.ALL,mappedBy="quiz")
    private List<Question> Questions;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Candidat> candidats;

}
