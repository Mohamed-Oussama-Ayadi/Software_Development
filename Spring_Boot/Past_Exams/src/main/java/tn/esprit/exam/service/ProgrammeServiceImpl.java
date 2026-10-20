package tn.esprit.exam.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.Chaine;
import tn.esprit.exam.entity.Programme;
import tn.esprit.exam.repository.ChaineRepository;
import tn.esprit.exam.repository.ProgrammeRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProgrammeServiceImpl implements IProgrammeService {

    ProgrammeRepository programmeRepository;
    ChaineRepository chaineRepository;

    //@Scheduled(cron = "0/15 * * * * *")
    // @Scheduled(fixedDelay = 10000) // 10000 millisecondes
    public List<Programme> retrieveAllProgrammes() {
        List<Programme> listC = programmeRepository.findAll();
        log.info("nombre total des programmes : " + listC.size());
       for (Programme c: listC) {
           log.info("programme : " + c);
       }
        return listC;
    }

    public Programme retrieveProgramme(Long programmeId) {
        Programme c = programmeRepository.findById(programmeId).get();
        return c;
    }

    public Programme ajouterProgramme(Programme c) {
        Programme programme = programmeRepository.save(c);
        return programme;
    }

    public Programme modifyProgramme(Programme programme) {
        Programme c = programmeRepository.save(programme);
        return c;
    }

    public void removeProgramme(Long programmeId) {
        programmeRepository.deleteById(programmeId);
    }

    public Programme ajouterProgrammeAndAssignProgrammeToChaine(Programme projet, Long projetDetailId) {
        Chaine chaine = chaineRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
        projet.setChaine(chaine);
        return programmeRepository.save(projet);
    }

    @Scheduled(fixedDelay = 20000)
    public void ordonnerChaines(){

    }

}
