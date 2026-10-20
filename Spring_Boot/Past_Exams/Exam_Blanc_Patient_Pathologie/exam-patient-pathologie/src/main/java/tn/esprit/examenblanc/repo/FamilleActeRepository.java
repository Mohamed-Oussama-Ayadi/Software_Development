package tn.esprit.examenblanc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entity.FamilleActe;

@Repository
public interface FamilleActeRepository extends JpaRepository<FamilleActe,Long> {
}
