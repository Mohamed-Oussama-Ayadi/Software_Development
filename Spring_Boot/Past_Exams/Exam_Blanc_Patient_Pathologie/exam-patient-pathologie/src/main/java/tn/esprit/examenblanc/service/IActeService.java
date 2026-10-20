package tn.esprit.examenblanc.service;

import tn.esprit.examenblanc.entity.Acte;
import tn.esprit.examenblanc.entity.FamilleActe;
import tn.esprit.examenblanc.entity.Pathologie;
import tn.esprit.examenblanc.entity.Patient;

import java.util.List;

public interface IActeService {
   void affecterActeAPathologie(String codeActe, String codePathologie);


   FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe fA);

   List<Acte> afficherActes(String codeFA);

   // Tous les Actes selon codePath :
   List<Acte> listerActesSelonCodePath(String codePath);


   Pathologie ajouterPathologie1(Pathologie p);
   void calculerNombreActeParPathologie6();
   float calculerFacture5(String identifiant);

   Patient creerPatientEtAffecterAPathologie2(Patient p, String codePath);

}
