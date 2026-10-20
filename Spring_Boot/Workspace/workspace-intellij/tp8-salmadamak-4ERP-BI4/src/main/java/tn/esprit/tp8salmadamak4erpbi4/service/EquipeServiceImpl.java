package tn.esprit.tp8salmadamak4erpbi4.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp8salmadamak4erpbi4.entity.Equipe;
import tn.esprit.tp8salmadamak4erpbi4.repository.EquipeRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class EquipeServiceImpl implements IEquipeService{
EquipeRepository equipeRepository;
    public List<Equipe> retrieveAllEquipes(){
        return equipeRepository.findAll();
    }
    public Equipe retrieveEquipe(Long idEquipe){
        return equipeRepository.findById(idEquipe).get();
    }

    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    public Equipe modifyEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    public void removeEquipe(Long idEquipe) {
        equipeRepository.deleteById(idEquipe);
    }
}
