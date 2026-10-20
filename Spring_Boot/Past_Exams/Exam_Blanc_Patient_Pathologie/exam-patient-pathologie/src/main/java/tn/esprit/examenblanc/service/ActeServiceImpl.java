package tn.esprit.examenblanc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.entity.Acte;
import tn.esprit.examenblanc.entity.FamilleActe;
import tn.esprit.examenblanc.entity.Pathologie;
import tn.esprit.examenblanc.entity.Patient;
import tn.esprit.examenblanc.repo.ActeRepository;
import tn.esprit.examenblanc.repo.FamilleActeRepository;
import tn.esprit.examenblanc.repo.PathologieRepository;
import tn.esprit.examenblanc.repo.PatientRepository;

import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class ActeServiceImpl implements IActeService{
    @Autowired
    ActeRepository acteRepository;

    @Autowired
    PathologieRepository pathologieRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    FamilleActeRepository familleActeRepository;


    @Override
    public void affecterActeAPathologie(String codeActe, String codePathologie) {

        Acte acte=acteRepository.findActeByCodeActe(codeActe);
        Pathologie pathologie=pathologieRepository.findByCodePath(codePathologie);

        pathologie.getActes().add(acte);

        pathologieRepository.save(pathologie);
    }

    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe fA) {

        FamilleActe f= familleActeRepository.save(fA);
        Set<Acte> actes = f.getActes();

        for (Acte acte : actes) {
            acte.setFacte(f);
            acteRepository.save(acte);
        }

        return f;
    }

    /*@Override
    public Acte ajouterActeEtFamilleActeAssocie(Acte a) {
       return  acteRepository.save(a);
    }*/

    @Override
    public List<Acte> afficherActes(String codeFA) {
       return acteRepository.findAllByFacte_CodeFamille(codeFA);
    }

    @Override
    public List<Acte> listerActesSelonCodePath(String codePath) {
        return acteRepository.listeActesSelonCodePath(codePath);
    }

    @Override
    public Patient creerPatientEtAffecterAPathologie2(Patient patient, String codePath) {

        Pathologie pathologie=pathologieRepository.findByCodePath(codePath);

        patient.getPathologies().add(pathologie);

        return patientRepository.save(patient);
    }

    @Override
    public Pathologie ajouterPathologie1(Pathologie p) {
        return pathologieRepository.save(p);
    }


    @Scheduled(fixedDelay = 30000)
    public void calculerNombreActeParPathologie6() {

        for(Pathologie p : pathologieRepository.findAll())
            log.info("Le nombre d'actes pour la pathologie "+p.getLibelle()+" est :"+ p.getActes().size());

    }

    @Override
    public float calculerFacture5(String identifiant) {

        float  facture=0;
        Pathologie pathologie=null;
        if(pathologieRepository.findPathologieByLibelle(identifiant)!=null) {
            pathologie=pathologieRepository.findPathologieByLibelle(identifiant);
        } else if (pathologieRepository.findByCodePath(identifiant)!=null) {
            pathologie=pathologieRepository.findByCodePath(identifiant);
        }


        if(pathologie.getArchive()==false) {
            for(Acte acte:pathologie.getActes()){
                facture=facture+(acte.getCotationActe()*acte.getPrixUnitaireActe());
            }
        }

        else log.info("La pathologie est archivée");
        return facture;
    }


}
