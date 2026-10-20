package tn.esprit.examen.nomPrenomClasseExamen.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Colis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColis;

    private String referenceColis;
    private Float prixCommande;
    private Date dateLivraison;
    @Enumerated(EnumType.STRING)
    private Etat etatColis;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "livreur_id")
    private Livreur livreur;

    @ManyToMany
    @JoinTable(
            name = "colis_produit",
            joinColumns = @JoinColumn(name = "colis_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Produit> produits=new ArrayList<>();

}
