package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
@EnableScheduling
@Slf4j

public class BlocServiceImpl implements IBlocService {

    BlocRepository blocRepository;
    FoyerRepository foyerRepository;
    @Scheduled(fixedDelay = 60000) // 1 minute
    public List<Bloc> retrieveAllBlocs(){
        return blocRepository.findAll();
    }
    public Bloc retrieveBloc(Long blocId){
        return blocRepository.findById(blocId).get();
    }

    public Bloc addBloc(Bloc c) {
        return blocRepository.save(c);
    }

    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }

    public Bloc addFoyerAndBlocDetailAndAssign(Bloc bloc) {
        return blocRepository.save(bloc);
    }


     public void assignfoyerTobloc(Long blocId, Long foyerId) {
        Bloc bloc = blocRepository.findById(blocId).get();
        Foyer foyer = foyerRepository.findById(foyerId).get();// on set le fils dans le parent :
        bloc.setFoyer(foyer);
        blocRepository.save(bloc);
    }


    public Bloc DesaffecterProjetDetailFromProjet(Long blocId) {
        Bloc projet = blocRepository.findById(blocId).get();
        projet.setFoyer(null);
        return blocRepository.save(projet);
    }
}
