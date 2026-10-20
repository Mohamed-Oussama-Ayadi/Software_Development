package tn.esprit.tp8salmadamak4erpbi4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp8salmadamak4erpbi4.entity.Projet;
@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
