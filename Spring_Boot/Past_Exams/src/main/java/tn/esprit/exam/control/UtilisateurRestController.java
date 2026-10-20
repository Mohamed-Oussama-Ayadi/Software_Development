package tn.esprit.exam.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.Utilisateur;
import tn.esprit.exam.service.IUtilisateurService;

import java.util.List;

@Tag(name = "Ce Web Service gère le CRUD pour une Utilisateur")
@RestController
@AllArgsConstructor
@RequestMapping("/utilisateur")
public class UtilisateurRestController {

    IUtilisateurService utilisateurService;

    // http://localhost:8089/exam/utilisateur/retrieve-all-utilisateurs
    @Operation(description = "Ce web service permet de récupérer toutes les utilisateurs de la base de données")
    @GetMapping("/retrieve-all-utilisateurs")
    public List<Utilisateur> getUtilisateurs() {
        List<Utilisateur> listUtilisateurs = utilisateurService.retrieveAllUtilisateurs();
        return listUtilisateurs;
    }
    // http://localhost:8089/exam/utilisateur/retrieve-utilisateur/8
    @GetMapping("/retrieve-utilisateur/{utilisateur-id}")
    public Utilisateur retrieveUtilisateur(@PathVariable("utilisateur-id") Long chId) {
        Utilisateur utilisateur = utilisateurService.retrieveUtilisateur(chId);
        return utilisateur;
    }

    // http://localhost:8089/exam/utilisateur/add-utilisateur
    @PostMapping("/add-utilisateur")
    public Utilisateur addUtilisateur(@RequestBody Utilisateur c) {
        Utilisateur utilisateur = utilisateurService.ajouterUtilisateur(c);
        return utilisateur;
    }




}
