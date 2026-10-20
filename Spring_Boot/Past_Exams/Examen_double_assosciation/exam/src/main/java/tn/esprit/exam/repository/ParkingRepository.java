package tn.esprit.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.exam.entity.Chambre;
import tn.esprit.exam.entity.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Integer> {



}
