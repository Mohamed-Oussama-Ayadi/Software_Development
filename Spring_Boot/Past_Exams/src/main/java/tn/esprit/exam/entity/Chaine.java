package tn.esprit.exam.entity;

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
public class Chaine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long chId;

    String chNom;

    @Enumerated(EnumType.STRING)
    Thematique thematique;

    @OneToMany(mappedBy = "chaine")
    Set<Programme> programmes;
}
