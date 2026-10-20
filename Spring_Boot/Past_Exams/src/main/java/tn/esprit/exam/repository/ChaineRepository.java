package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Chaine;
import tn.esprit.exam.entity.Utilisateur;

@Repository
public interface ChaineRepository extends JpaRepository<Chaine, Long> {



}
