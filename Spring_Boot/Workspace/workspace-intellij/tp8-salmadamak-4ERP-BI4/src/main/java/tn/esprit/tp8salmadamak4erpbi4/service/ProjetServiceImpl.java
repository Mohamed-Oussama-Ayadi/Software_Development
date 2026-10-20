package tn.esprit.tp8salmadamak4erpbi4.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.tp8salmadamak4erpbi4.entity.Equipe;
import tn.esprit.tp8salmadamak4erpbi4.entity.Projet;
import tn.esprit.tp8salmadamak4erpbi4.entity.ProjetDetail;
import tn.esprit.tp8salmadamak4erpbi4.repository.EquipeRepository;
import tn.esprit.tp8salmadamak4erpbi4.repository.ProjetDetailRepository;
import tn.esprit.tp8salmadamak4erpbi4.repository.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class ProjetServiceImpl implements IProjetService{
ProjetRepository projetRepository;
ProjetDetailRepository projetDetailRepository;
EquipeRepository equipeRepository;
    public List<Projet> retrieveAllProjets(){
        return projetRepository.findAll();
    }
    public Projet retrieveProjet(Long idProjet){
        return projetRepository.findById(idProjet).get();
    }

    public Projet addProjet(Projet e) {
        return projetRepository.save(e);
    }

    public Projet modifyProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    public void removeProjet(Long idProjet) {
        projetRepository.deleteById(idProjet);
    }
    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {
        return projetRepository.save(projet);
    }
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
        Projet projet = projetRepository.findById(projetId).get();
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
        projet.setProjetDetail(projetDetail);
        projetRepository.save(projet);
    }

    public void assignProjetToEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
// on set le fils dans le parent :
        equipe.getProjets().add(projet);
        equipeRepository.save(equipe);
    }


    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
        projet.setProjetDetail(projetDetail);
        return projetRepository.save(projet);
    }

    public Projet DesaffecterProjetDetailFromProjet(Long projetId) {
        Projet projet = projetRepository.findById(projetId).get();
        projet.setProjetDetail(null);
        return projetRepository.save(projet);
    }

    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
// on enlève le fils du parent :
        equipe.getProjets().remove(projet);
        equipeRepository.save(equipe);
    }
}
