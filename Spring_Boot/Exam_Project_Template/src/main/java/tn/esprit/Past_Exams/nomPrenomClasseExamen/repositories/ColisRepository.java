package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Colis;

import java.util.List;

@Repository
public interface ColisRepository extends JpaRepository<Colis, Long> {
    @Query("SELECT c FROM Colis c WHERE c.referenceColis IN :references")
    List<Colis> findByReferenceIn(List<String> references);
}
