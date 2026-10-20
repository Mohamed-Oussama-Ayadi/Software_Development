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
public class Acte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActe;

    private String codeActe;
    private long cotationActe;
    private float prixUnitaireActe;
    private String typeCotation;
    private String designationActe;
    private Boolean actif;


    // Très important : initailiation des Set pour que l'affectaiton marche bien :
    // private Set<X> pathologies=new HashSet<X>();

    @ManyToMany(mappedBy = "actes")
    @JsonIgnore
    @ToString.Exclude
    private Set<Pathologie> pathologies=new HashSet<Pathologie>();

    @ManyToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private FamilleActe facte;

}
