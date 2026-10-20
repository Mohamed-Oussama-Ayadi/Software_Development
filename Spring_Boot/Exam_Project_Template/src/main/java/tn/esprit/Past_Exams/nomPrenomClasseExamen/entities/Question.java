package tn.esprit.examen.nomPrenomClasseExamen.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int idQuestion;
    String libelleQ;
    @Enumerated(EnumType.STRING)
    Complexite complexite;
    @ManyToOne
    Question question;
    @ManyToOne
    Quiz quiz;

}

