package tn.esprit.services;


import tn.esprit.entities.Car;
import tn.esprit.entities.Driver;
import tn.esprit.entities.Owner;
import tn.esprit.entities.Status;

import java.util.List;

public interface IExamService {

    public Owner addOwner(Owner owner);

    public Driver addDriver(Driver driver);

    public Car addCarAndAssignToOwner(Car car,long ownerId);

    public Driver assignDriverToCar(long DriverId,long isbn);

    public List<Driver> retriveDriversByStatus(Status status);
}
