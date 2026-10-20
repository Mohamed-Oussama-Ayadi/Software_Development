package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.BlocRepository;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j

public class ChambreServiceImpl implements IChambreService {
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Scheduled(fixedDelay = 10000) // 10000 millisecondes

    public List<Chambre> retrieveAllChambres(){
        return chambreRepository.findAll();
    }
    public Chambre retrieveChambre(Long chambreId){
        return chambreRepository.findById(chambreId).get();
    }

    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }

    public void assignChambreToBloc(Long idChambre, Long idBloc) {
        Chambre chambre = chambreRepository.findById(idChambre).get();
        Bloc bloc = blocRepository.findById(idBloc).get();
// on set le fils dans le parent :
        chambre.setBloc(bloc);

        chambreRepository.save(chambre);
    }
}
