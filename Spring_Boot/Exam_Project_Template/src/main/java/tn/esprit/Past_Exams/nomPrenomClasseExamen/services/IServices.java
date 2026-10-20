package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.Candidat;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Client;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Quiz;

import java.util.List;

public interface IServices {
    Client add(Client client);
    public Candidat ajouterCandidat(Candidat candidat) ;
    public Quiz ajouterQuiz(Quiz quiz) ;
    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat) ;
    void test();
}
