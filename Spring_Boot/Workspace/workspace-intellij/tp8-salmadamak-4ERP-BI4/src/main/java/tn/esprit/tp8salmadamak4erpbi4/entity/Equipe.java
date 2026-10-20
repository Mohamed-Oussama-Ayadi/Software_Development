package tn.esprit.tp8salmadamak4erpbi4.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipe;

    Long nom;
    @ToString.Exclude
    @Enumerated(EnumType.STRING)
    Domaine Dom;
    @ToString.Exclude
    @ManyToMany( cascade = CascadeType.ALL)
    Set<Projet> projets;

}
