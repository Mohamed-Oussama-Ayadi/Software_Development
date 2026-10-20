package tn.esprit.tpfoyer.entity;

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

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idFoyer;
     String nomFoyer;
     long capaciteFoyer;
    @ToString.Exclude

    @OneToOne(mappedBy = "foyer")
     Universite universite;
    @ToString.Exclude

    @OneToMany(mappedBy = "foyer")
     List<Bloc> blocs;


}
