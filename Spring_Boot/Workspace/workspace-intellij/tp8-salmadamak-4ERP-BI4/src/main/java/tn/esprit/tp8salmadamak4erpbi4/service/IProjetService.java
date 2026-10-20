package tn.esprit.tp8salmadamak4erpbi4.service;

import tn.esprit.tp8salmadamak4erpbi4.entity.Projet;

import java.util.List;

public interface IProjetService {
    public List<Projet> retrieveAllProjets();
    public Projet retrieveProjet(Long idProjet);
    public Projet addProjet(Projet e);
    public void removeProjet(Long idProjet);
    public Projet modifyProjet(Projet Projet);
    public Projet addProjetAndProjetDetailAndAssign(Projet projet);
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId);
    public void assignProjetToEquipe(Long projetId, Long equipeId);
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet, Long projetDetailId);
    public Projet DesaffecterProjetDetailFromProjet(Long projetId);
    public void desaffecterProjetFromEquipe(Long projetId, Long equipeId);
}
