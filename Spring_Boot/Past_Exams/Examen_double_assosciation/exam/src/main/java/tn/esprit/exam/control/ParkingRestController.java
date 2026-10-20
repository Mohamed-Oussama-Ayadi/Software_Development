package tn.esprit.exam.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.Parking;
import tn.esprit.exam.entity.Zone;
import tn.esprit.exam.service.IParkingService;

import java.util.List;

@Tag(name = "Ce Web Service gère le CRUD pour une Parking")
@RestController
@AllArgsConstructor
@RequestMapping("/parking")
public class ParkingRestController {

    IParkingService parkingService;



    // http://localhost:8089/exam/parking/add-parking
    @PostMapping("/ajoutParkingetZones")
    public void ajoutParkingetZones(@RequestBody Parking c) {
        parkingService.ajoutParkingetZones(c,c.getZones());
    }





}
