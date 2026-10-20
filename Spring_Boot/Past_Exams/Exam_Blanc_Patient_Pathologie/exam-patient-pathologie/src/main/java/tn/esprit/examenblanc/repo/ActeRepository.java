package tn.esprit.examenblanc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entity.Acte;

import java.util.List;

@Repository
public interface ActeRepository extends JpaRepository<Acte,Long> {

    Acte findActeByCodeActe(String code);

    List<Acte> findAllByFacte_CodeFamille(String codeF);


    // (Many To One) on peut utiliser les Keywords :
    // List<Acte> findAllByFActe_CodeFamille(String codeFA);

    // Tous les Actes selon CodePath : (ManyTOMany)
    // Exemple JPQL, c n'est pas une question de l'examn :

    @Query("SELECT a FROM Acte a " +
            "INNER JOIN a.pathologies p " +
            "WHERE p.codePath = :cp")
    List<Acte> listeActesSelonCodePath(@Param("cp") String cp);


}
