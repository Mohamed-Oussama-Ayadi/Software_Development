package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Programme;
import tn.esprit.exam.entity.Utilisateur;

@Repository
public interface ProgrammeRepository extends JpaRepository<Programme, Long> {




}
