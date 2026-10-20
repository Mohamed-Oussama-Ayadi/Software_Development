package tn.esprit.exam.service;

import tn.esprit.exam.entity.Personnel;
import tn.esprit.exam.entity.Poste;

import java.util.List;

public interface IPersonnelService {

    public List<Personnel> listerPersonnel();
    public Personnel ajouterPersonnel(Personnel c);
    public void affecterPersonnelZone(int idzone, int idGarde, Poste poste);

    // Here we will add if any method calling keywords or JPQL


}
