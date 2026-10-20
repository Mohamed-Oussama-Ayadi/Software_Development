package tn.esprit.exam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long prId;

    String prNom;

    @ManyToMany(mappedBy="programmes", cascade = CascadeType.ALL)
    private Set<Utilisateur> utilisateurs;

    @ManyToOne(cascade = CascadeType.ALL)
    Chaine chaine;

}
