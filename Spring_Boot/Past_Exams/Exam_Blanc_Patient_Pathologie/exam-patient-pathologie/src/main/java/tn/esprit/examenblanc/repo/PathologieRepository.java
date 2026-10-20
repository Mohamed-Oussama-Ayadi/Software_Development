package tn.esprit.examenblanc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entity.Pathologie;

@Repository
public interface PathologieRepository extends JpaRepository<Pathologie,Long> {


    Pathologie findByCodePath(String cp);


    Pathologie findPathologieByLibelle(String identifiant);

}
