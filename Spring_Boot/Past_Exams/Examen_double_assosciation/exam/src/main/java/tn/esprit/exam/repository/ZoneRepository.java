package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Personnel;
import tn.esprit.exam.entity.Zone;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer> {



}
