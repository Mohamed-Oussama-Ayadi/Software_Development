package tn.esprit.tp8salmadamak4erpbi4.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProjet;
    String sujet;
    @ToString.Exclude
    @OneToOne(cascade = CascadeType.ALL)
    ProjetDetail projetDetail;
    @ToString.Exclude
    @ManyToMany(mappedBy = "projets",cascade = CascadeType.ALL)
    private Set<Equipe> equipes;
}
