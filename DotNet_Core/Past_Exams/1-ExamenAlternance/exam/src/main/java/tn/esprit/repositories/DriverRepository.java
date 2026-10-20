package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.entities.Driver;
import tn.esprit.entities.Status;

import java.util.List;


@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {



//    @Query("select distinct (l.driver) from LocationCard l where l.status = :status")
//    @Query("select d from Driver d join LocationCard l on l member d.locationCards where l.status = :status")
    public List<Driver> findByLocationCardsStatus(Status status);
}
