package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Car;
import tn.esprit.entities.Owner;



@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
