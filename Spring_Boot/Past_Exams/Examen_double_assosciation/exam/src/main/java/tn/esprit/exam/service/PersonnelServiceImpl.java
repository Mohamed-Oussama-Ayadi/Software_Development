package tn.esprit.exam.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.Personnel;
import tn.esprit.exam.entity.Poste;
import tn.esprit.exam.entity.Zone;
import tn.esprit.exam.repository.PersonnelRepository;
import tn.esprit.exam.repository.ZoneRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class PersonnelServiceImpl implements IPersonnelService {

    PersonnelRepository personnelRepository;
    ZoneRepository zoneRepository;

    //@Scheduled(cron = "0/15 * * * * *")
    // @Scheduled(fixedDelay = 10000) // 10000 millisecondes
    public List<Personnel> listerPersonnel() {
        List<Personnel> listC = personnelRepository.findAll();
        log.info("nombre total des personnels : " + listC.size());
       for (Personnel c: listC) {
           log.info("personnel : " + c);
       }
        return listC;
    }



    public Personnel ajouterPersonnel(Personnel personnel) {
        return  personnelRepository.save(personnel);
    }

    public void affecterPersonnelZone(int idzone, int idGarde, Poste poste){
        Zone zone = zoneRepository.findById(idzone).get();
        Personnel personnel = personnelRepository.findById(idGarde).get();
        personnel.setZone1(zone);
        personnel.setPoste(poste);
        personnelRepository.save(personnel);

    }




}
