package tn.esprit.exam.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.Personnel;
import tn.esprit.exam.entity.Poste;
import tn.esprit.exam.service.IPersonnelService;

import java.time.ZoneId;
import java.util.List;

@Tag(name = "Ce Web Service gère le CRUD pour une Personnel")
@RestController
@AllArgsConstructor
@RequestMapping("/personnel")
public class PersonnelRestController {

    IPersonnelService personnelService;

    // http://localhost:8089/exam/personnel/retrieve-all-personnels
    @Operation(description = "Ce web service permet de récupérer toutes les personnels de la base de données")
    @GetMapping("/retrieve-all-personnels")
    public List<Personnel> getPersonnels() {
        List<Personnel> listPersonnels = personnelService.listerPersonnel();
        return listPersonnels;
    }


    // http://localhost:8089/exam/personnel/add-personnel
    @PostMapping("/add-personnel")
    public Personnel addPersonnel(@RequestBody Personnel c) {
        Personnel personnel = personnelService.ajouterPersonnel(c);
        return personnel;
    }
    @PutMapping("/affecter-perso-a-zone/{zone-id}/{garde-id}/{poste}")
    public void affecterpersoAzone(@PathVariable("zone-id") Integer zoneId, @PathVariable("garde-id") Integer gardeId, @PathVariable("poste") Poste poste ) {
        personnelService.affecterPersonnelZone(zoneId,gardeId,poste);
    }




}
