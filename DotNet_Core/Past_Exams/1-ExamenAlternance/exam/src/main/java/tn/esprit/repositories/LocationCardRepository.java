package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.LocationCard;


@Repository
public interface LocationCardRepository extends JpaRepository<LocationCard, Long> {
}
