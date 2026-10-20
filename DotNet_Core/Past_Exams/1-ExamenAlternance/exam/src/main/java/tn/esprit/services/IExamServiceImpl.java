package tn.esprit.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.entities.*;
import tn.esprit.repositories.CarRepository;
import tn.esprit.repositories.DriverRepository;
import tn.esprit.repositories.LocationCardRepository;
import tn.esprit.repositories.OwnerRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor
public class IExamServiceImpl implements IExamService {
//    private final ClasseRepository classeRepository;

    private  final OwnerRepository ownerRepository;
    private  final DriverRepository driverRepository;
    private  final CarRepository carRepository;
    private  final LocationCardRepository locationCardRepository;



    public Owner addOwner(Owner owner){
        return this.ownerRepository.save(owner);
    }

    public Driver addDriver(Driver driver)
    {
        return this.driverRepository.save(driver);

    }

    public Car addCarAndAssignToOwner(Car car, long ownerId)
    {
        Owner owner = this.ownerRepository.findById(ownerId).orElse(null);

        Car car1=this.carRepository.save(car);

        Set<Car> cars=new HashSet<>();
        cars.add(car1);

        owner.setCars(cars);

        this.ownerRepository.save(owner);
        return car1;



    }

    public Driver assignDriverToCar(long DriverId,long isbn)
    {
return null;
    }

    public List<Driver> retriveDriversByStatus(Status status)
    {
        return this.driverRepository.findByLocationCardsStatus(status);
    }


    @Scheduled(cron = "*/30 * * * * *")
    public void locationCard() {
        List<LocationCard> locationCards = this.locationCardRepository.findAll();

        LocalDate currentDate = LocalDate.now();

        for (LocationCard locationCard : locationCards) {
            LocalDate cardDate = locationCard.getLocalDate();

            if (currentDate.minusDays(30).isAfter(cardDate)) {
                locationCard.setStatus(Status.EXPIRED);
                locationCardRepository.save(locationCard);
            }
        }
    }

}
