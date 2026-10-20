package tn.esprit.tpfoyer.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idChambre;

     Long numeroChambre; //NUM_CHAMBRE
    @ToString.Exclude

    @Enumerated(EnumType.STRING)
     TypeChambre typeC;
    @ToString.Exclude

    @ManyToOne
     Bloc bloc;
    @ToString.Exclude
    //reservation elli kenet tetla3 louta (kemla) Ignore tjiblek ken l ID
@JsonIgnore
    @OneToMany
     List<Reservation> reservations;
}