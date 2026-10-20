package tn.esprit.exam.service;

import tn.esprit.exam.entity.Utilisateur;

import java.util.List;

public interface IUtilisateurService {

    public List<Utilisateur> retrieveAllUtilisateurs();
    public Utilisateur retrieveUtilisateur(Long utilisateurId);
    public Utilisateur ajouterUtilisateur(Utilisateur c);
    public void removeUtilisateur(Long utilisateurId);
    public Utilisateur modifyUtilisateur(Utilisateur utilisateur);

    // Here we will add if any method calling keywords or JPQL


}
