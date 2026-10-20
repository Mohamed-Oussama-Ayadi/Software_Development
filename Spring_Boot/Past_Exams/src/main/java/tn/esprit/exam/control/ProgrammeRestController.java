package tn.esprit.exam.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.Programme;
import tn.esprit.exam.service.IProgrammeService;

import java.util.List;

@Tag(name = "Ce Web Service gère le CRUD pour une Programme")
@RestController
@AllArgsConstructor
@RequestMapping("/programme")
public class ProgrammeRestController {

    IProgrammeService programmeService;

    // http://localhost:8089/exam/programme/retrieve-all-programmes
    @Operation(description = "Ce web service permet de récupérer toutes les programmes de la base de données")
    @GetMapping("/retrieve-all-programmes")
    public List<Programme> getProgrammes() {
        List<Programme> listProgrammes = programmeService.retrieveAllProgrammes();
        return listProgrammes;
    }
    // http://localhost:8089/exam/programme/retrieve-programme/8
    @GetMapping("/retrieve-programme/{programme-id}")
    public Programme retrieveProgramme(@PathVariable("programme-id") Long chId) {
        Programme programme = programmeService.retrieveProgramme(chId);
        return programme;
    }

    // http://localhost:8089/exam/programme/add-programme
    @PostMapping("/add-programme")
    public Programme addProgramme(@RequestBody Programme c) {
        Programme programme = programmeService.ajouterProgramme(c);
        return programme;
    }

    // http://localhost:8089/exam/programme/remove-programme/{programme-id}
    @DeleteMapping("/remove-programme/{programme-id}")
    public void removeProgramme(@PathVariable("programme-id") Long chId) {
        programmeService.removeProgramme(chId);
    }

    // http://localhost:8089/exam/programme/modify-programme
    @PutMapping("/modify-programme")
    public Programme modifyProgramme(@RequestBody Programme c) {
        Programme programme = programmeService.modifyProgramme(c);
        return programme;
    }


    @PutMapping("/ajouter-projet-affecter-to-projetDetail/{projet-detail-id}")
    public Programme ajoutProjetAffectToProjetDetail(@RequestBody Programme projet,@PathVariable("projet-detail-id") Long projetDetailId) {
        Programme programme =programmeService.ajouterProgrammeAndAssignProgrammeToChaine(projet,projetDetailId);
        return programme;
    }


}
