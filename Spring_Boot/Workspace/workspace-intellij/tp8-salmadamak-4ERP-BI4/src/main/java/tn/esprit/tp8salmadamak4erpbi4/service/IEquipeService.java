package tn.esprit.tp8salmadamak4erpbi4.service;

import tn.esprit.tp8salmadamak4erpbi4.entity.Equipe;

import java.util.List;

public interface IEquipeService {
    public List<Equipe> retrieveAllEquipes();
    public Equipe retrieveEquipe(Long idEquipe);
    public Equipe addEquipe(Equipe e);
    public void removeEquipe(Long idEquipe);
    public Equipe modifyEquipe(Equipe Equipe);
}
