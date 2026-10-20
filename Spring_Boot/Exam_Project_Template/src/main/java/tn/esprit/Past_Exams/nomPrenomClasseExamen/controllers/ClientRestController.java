package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Candidat;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Client;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Quiz;
import tn.esprit.examen.nomPrenomClasseExamen.services.IServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("examen")
@RestController
public class ClientRestController {
    private final IServices services;

    @PostMapping("/add")
    public Client add(@RequestBody Client client){
        return  services.add(client);
    }
    @PostMapping("/candidat")
    public Candidat add(@RequestBody Candidat candidat){
        return  services.ajouterCandidat(candidat);
    }

    @PostMapping("/quiz")
    public Quiz add(@RequestBody Quiz quiz){
        return  services.ajouterQuiz(quiz);
    }
    

}
