package tn.esprit.tp8salmadamak4erpbi4.control;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp8salmadamak4erpbi4.entity.Equipe;
import tn.esprit.tp8salmadamak4erpbi4.service.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipe")

public class EquipeRestController {
    IEquipeService equipeService;
    
    @GetMapping("/retrieve-all-equipes")
    public List<Equipe> getEquipes() {
        List<Equipe> listEquipes = equipeService.retrieveAllEquipes();
        return listEquipes;
    }

    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Long idEquipe) {
        Equipe equipe = equipeService.retrieveEquipe(idEquipe);
        return equipe;
    }
    @PostMapping("/add-equipe")
    public Equipe addEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.addEquipe(e);
        return equipe;
    }
    @DeleteMapping("/remove-equipe/{equipe-id}")
    public void removeEquipe(@PathVariable("equipe-id") Long idEquipe) {
        equipeService.removeEquipe(idEquipe);
    }

    @PutMapping("/modify-equipe")
    public Equipe modifyEquipe(@RequestBody Equipe e) {
        Equipe equipe = equipeService.modifyEquipe(e);
        return equipe;
    }
}
