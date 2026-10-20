package tn.esprit.exam.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String designation;
    String adresse;
    int capacite;
    @OneToMany(mappedBy = "parking")
    List<Zone> zones=new ArrayList<>();
    






}
