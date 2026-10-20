package tn.esprit.exam.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.*;
import tn.esprit.exam.repository.ChaineRepository;
import tn.esprit.exam.repository.ProgrammeRepository;
import tn.esprit.exam.repository.UtilisateurRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class UtilisateurServiceImpl implements IUtilisateurService {


    UtilisateurRepository utilisateurRepository;
    ProgrammeRepository programmeRepository;
    ChaineRepository chaineRepository;


    public Utilisateur ajouterUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    public Programme ajouterProgrammeEtChaine(Programme p) {
        return programmeRepository.save(p);
    }

    public Programme ajouterProgrammeEtAffecterChaine(Programme p, Long chId) {
        Chaine chaine = chaineRepository.findById(chId).get();
        p.setChaine(chaine);
        return programmeRepository.save(p);
    }

    public void affecterProgrammeAUtilisateur(String prNom, String usrNom) {
        Programme p = programmeRepository.findByPrNom(prNom);
        Utilisateur u = utilisateurRepository.findByUsrNom(usrNom);

        u.getProgrammes().add(p);

        utilisateurRepository.save(u);

    }

    public List<Utilisateur> recupererUtilisateurs(Profession p, Date d, Thematique t) {

        return utilisateurRepository.listerUtilisateurs(p, d, t);

    }

    @Scheduled(fixedDelay = 20000)
    public void ordonnerChaines() {

        List<Object[]> l = chaineRepository.listerchaines();

        for (Object[] obj : l) {
            Chaine chaine = (Chaine) obj[0];
            Long nbre = (Long) obj[1];
            log.info("Chaine : " + chaine.getChNom() + ".  Nombre de fois où les programmes de cette Chaine sont marqués comme favoris  : " + nbre);
        }

    }

    /*@Override
    public List<Programme> recupererProgrammesInteressants(Long usrId) {

        Utilisateur u = utilisateurRepository.findById(usrId).get();

        return programmeRepository.listerProgrammesInteressants(u.getProfession());

    }*/

    public void desaffecterProgrammeDeUtilisateur(String prNom, String usrNom) {

        Programme p = programmeRepository.findByPrNom(prNom);
        Utilisateur u = utilisateurRepository.findByUsrNom(usrNom);

        u.getProgrammes().remove(p);

        utilisateurRepository.save(u);

    }


}
