package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Programme;
import tn.esprit.exam.entity.Utilisateur;

import java.util.List;
import java.util.Set;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {



}
