package tn.esprit.exam.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.Utilisateur;
import tn.esprit.exam.repository.UtilisateurRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class UtilisateurServiceImpl implements IUtilisateurService {

    UtilisateurRepository utilisateurRepository;

    //@Scheduled(cron = "0/15 * * * * *")
    // @Scheduled(fixedDelay = 10000) // 10000 millisecondes
    public List<Utilisateur> retrieveAllUtilisateurs() {
        List<Utilisateur> listC = utilisateurRepository.findAll();
        log.info("nombre total des utilisateurs : " + listC.size());
       for (Utilisateur c: listC) {
           log.info("utilisateur : " + c);
       }
        return listC;
    }

    public Utilisateur retrieveUtilisateur(Long utilisateurId) {
        Utilisateur c = utilisateurRepository.findById(utilisateurId).get();
        return c;
    }

    public Utilisateur ajouterUtilisateur(Utilisateur c) {
        Utilisateur utilisateur = utilisateurRepository.save(c);
        return utilisateur;
    }

    public Utilisateur modifyUtilisateur(Utilisateur utilisateur) {
        Utilisateur c = utilisateurRepository.save(utilisateur);
        return c;
    }

    public void removeUtilisateur(Long utilisateurId) {
        utilisateurRepository.deleteById(utilisateurId);
    }

    public void affecterProgrammeAUtilisateur(String prNom, String usrNom)
    {
        //utilisateurRepository.findUtilisateursByProgrammes(prNom);
    }

}
