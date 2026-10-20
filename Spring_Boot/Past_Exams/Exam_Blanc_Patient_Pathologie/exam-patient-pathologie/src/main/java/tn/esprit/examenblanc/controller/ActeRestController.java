package tn.esprit.examenblanc.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.entity.Acte;
import tn.esprit.examenblanc.entity.FamilleActe;
import tn.esprit.examenblanc.entity.Pathologie;
import tn.esprit.examenblanc.entity.Patient;
import tn.esprit.examenblanc.service.IActeService;

@RestController
public class ActeRestController {

    @Autowired
    IActeService acteService;

    @PutMapping("/affectActeAPathologie/{code-acte}/{code-patho}")
    void affecterActeAPathologie(@PathVariable("code-acte") String codeActe, @PathVariable("code-patho") String codePathologie)
    {
        acteService.affecterActeAPathologie(codeActe,codePathologie);
    }

   /* @PostMapping("/ajouterActerEtFA")
    Acte ajouterActeEtFA(@RequestBody Acte acte){
        return acteService.ajouterActeEtFamilleActeAssocie(acte);
    }*/


    @PostMapping("/ajouterFamilleActeEtActeAssocie")
    FamilleActe ajouterFamilleActeEtActeAssocie(@RequestBody FamilleActe fA){
        return acteService.ajouterFamilleActeEtActeAssocie(fA);
    }

    @PostMapping("/ajouterPathologie")
    Pathologie  ajouterPathologie1(@RequestBody Pathologie p){
        return acteService.ajouterPathologie1(p);
    }

    @GetMapping("/calculer/{id}")
    float calculerFacture5(@PathVariable("id") String identifiant){
        return acteService.calculerFacture5(identifiant);
    }


    @PostMapping("creerPatientEtAffecter/{code-path}")
    Patient creerPatientEtAffecterAPathologie2(@RequestBody Patient p, @PathVariable("code-path") String codePath){
        return acteService.creerPatientEtAffecterAPathologie2(p,codePath);
    }

}
