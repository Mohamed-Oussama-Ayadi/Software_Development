package tn.esprit.tp8salmadamak4erpbi4.control;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp8salmadamak4erpbi4.entity.Projet;
import tn.esprit.tp8salmadamak4erpbi4.service.IProjetService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Projet")

public class ProjetRestController {
    IProjetService projetService;
    
    @GetMapping("/retrieve-all-projets")
    public List<Projet> getProjets() {
        List<Projet> listProjets = projetService.retrieveAllProjets();
        return listProjets;
    }

    @GetMapping("/retrieve-projet/{projet-id}")
    public Projet retrieveProjet(@PathVariable("projet-id") Long idProjet) {
        Projet projet = projetService.retrieveProjet(idProjet);
        return projet;
    }
    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet e) {
        Projet projet = projetService.addProjet(e);
        return projet;
    }
    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") Long idProjet) {
        projetService.removeProjet(idProjet);
    }

    @PutMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet e) {
        Projet projet = projetService.modifyProjet(e);
        return projet;
    }
    @PostMapping("/ajouter-projet-et-projet-detail")
    public Projet addProjetAndProjetDetail(@RequestBody Projet p) {
        Projet projet = projetService.addProjetAndProjetDetailAndAssign(p);
        return projet;
    }

    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId,
                                             @PathVariable("projet-details-id") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(proejtId, proejtDetailsId);
    }


    @PutMapping("/affecter-projet-a-equipe/{projet-id}/{equipe-id}")
    public void affecgterProjetAequipe(@PathVariable("projet-id") Long proejtId,
                                             @PathVariable("equipe-id") Long equipeId) {
        projetService.assignProjetToEquipe(proejtId,equipeId);
    }


    @PutMapping("/ajouter-projet-affecter-projet-details/{projet-details-id}")
    public void ajouterProjetEtaffecterProjetDetail(@RequestBody Projet p, @PathVariable ("projet-details-id") Long projetDetailId)
    {
        projetService.addProjetAndAssignProjetToProjetDetail(p,projetDetailId);
    }


    @PutMapping("/desaffecter-projet-detail/{projet-id}")
    public void desaffecterProjet(@PathVariable("projet-id") Long proejtId)
    {
        projetService.DesaffecterProjetDetailFromProjet(proejtId);
    }

    @PutMapping("/desaffecter-projet-de-equipe/{projet-id}/{equipe-id}")
    public void desaffecterProjetdeEquipe(@PathVariable("projet-id") Long proejtId,
                                       @PathVariable("equipe-id") Long equipeId) {
        projetService.desaffecterProjetFromEquipe(proejtId,equipeId);
    }
}
