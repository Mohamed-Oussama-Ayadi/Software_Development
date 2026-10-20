package tn.esprit.examenblanc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FamilleActe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFamilleActe;

    private String codeFamille;
    private String libelle;
    private String description;


    @OneToMany(mappedBy = "facte",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @ToString.Exclude
    //@JsonIgnore
    private Set<Acte> actes=new HashSet<Acte>();
}
