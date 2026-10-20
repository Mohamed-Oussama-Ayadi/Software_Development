package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Client;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Colis;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Livreur;
import tn.esprit.examen.nomPrenomClasseExamen.services.IServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("examen")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final IServices services;

    @PostMapping("/clients")
    public Client ajouterClient(@RequestBody Client client) {
        return services.ajouterClient(client);
    }
    @PostMapping("/colis/{idClient}")
    public Colis ajouterColisEtAffecterAuClient(@RequestBody Colis colis, @PathVariable Long idClient) {
        return services.ajouterColisEtAffecterAuClient(colis, idClient);
    }
    @PostMapping("/livreurs/{referenceColis}")
    public void ajouterLivreurEtAffecterAuColisLivreur(@RequestBody Livreur livreur, @RequestParam List<String> referencesColis) {
        services.ajouterLivreurEtAffecterAuColisLivreur(livreur, referencesColis);
    }


}
