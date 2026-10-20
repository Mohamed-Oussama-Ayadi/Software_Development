package tn.esprit.examenblanc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    private String identifiantPieceIDentite;
    @Temporal(TemporalType.DATE)
    private Date dateEmission;
    private String matriculeCNAM;
    private String nomP;
    private String prenomP;

    @Enumerated(EnumType.STRING)
    private TypePieceIdentite type;

    @ManyToMany
    Set<Pathologie> pathologies=new HashSet<Pathologie>();
}
