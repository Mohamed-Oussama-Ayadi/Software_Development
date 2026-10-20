package tn.esprit.exam.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.exam.entity.Parking;
import tn.esprit.exam.entity.Zone;
import tn.esprit.exam.repository.ParkingRepository;
import tn.esprit.exam.repository.ZoneRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ParkingServiceImpl implements IParkingService {

    ParkingRepository parkingRepository;
    ZoneRepository zoneRepository;

    //@Scheduled(cron = "0/15 * * * * *")
    // @Scheduled(fixedDelay = 10000) // 10000 millisecondes
    public List<Parking> retrieveAllParkings() {
        List<Parking> listC = parkingRepository.findAll();
        log.info("nombre total des parkings : " + listC.size());
       for (Parking c: listC) {
           log.info("parking : " + c);
       }
        return listC;
    }



    public Parking addParking(Parking c) {
        Parking parking = parkingRepository.save(c);
        return parking;
    }

    public void ajoutParkingetZones(Parking parking, List<Zone> listZones)
    {
        Parking p = parkingRepository.save(parking);
        for(Zone zone:listZones){
            zone.setParking(p);
            zoneRepository.save(zone);
        }
    }

    public Parking modifyParking(Parking parking) {
        Parking c = parkingRepository.save(parking);
        return c;
    }



}
