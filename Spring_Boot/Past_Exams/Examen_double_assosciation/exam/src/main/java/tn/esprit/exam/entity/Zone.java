package tn.esprit.exam.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String ref;
    float dimension;
    @OneToMany(mappedBy = "zone1")
    List<Personnel> personnels;
    @OneToOne(mappedBy = "zone2")
    Personnel personnel;
    @ManyToOne
    Parking parking;


}
