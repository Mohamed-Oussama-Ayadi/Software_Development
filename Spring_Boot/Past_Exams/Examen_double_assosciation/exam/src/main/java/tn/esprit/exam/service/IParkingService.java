package tn.esprit.exam.service;

import tn.esprit.exam.entity.Parking;
import tn.esprit.exam.entity.Zone;

import java.util.List;

public interface IParkingService {

    public List<Parking> retrieveAllParkings();
    public Parking addParking(Parking c);
    public Parking modifyParking(Parking parking);
    public void ajoutParkingetZones(Parking parking, List<Zone> listZones);
    // Here we will add if any method calling keywords or JPQL


}
