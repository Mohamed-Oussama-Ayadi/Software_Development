package tn.esprit.tpfoyer.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.service.IBlocService;
import tn.esprit.tpfoyer.service.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")

public class BlocRestController {
    IBlocService blocService;
    IChambreService chambreService;
    // http://localhost:8089/tpfoyer/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;
    }

    // http://localhost:8089/tpfoyer/bloc/retrieve-bloc/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long chId) {
        Bloc bloc = blocService.retrieveBloc(chId);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.addBloc(c);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long chId) {
        blocService.removeBloc(chId);
    }

    // http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.modifyBloc(c);
        return bloc;
    }

    @PostMapping("/ajouter-foyer-et-bloc-detail")
    public Bloc addFoyerAndBlocDetail(@RequestBody Bloc b) {
        Bloc bloc = blocService.addFoyerAndBlocDetailAndAssign( b);
        return bloc;
    }

    @PutMapping("/affecter-bloc-foyer/{bloc-id}/{foyer-id}")
    public void assignBlocToFoyer(@PathVariable("bloc-id") Long BlocId,
                                  @PathVariable("foyer-id") Long foyerId) {
        blocService.assignfoyerTobloc(BlocId,foyerId);
    }
    @PutMapping("/desaffecter-projet-projetDetail/{bloc-id}")
    public void desaffecter(@PathVariable("bloc-id") Long blocId) {
        blocService.DesaffecterProjetDetailFromProjet(blocId);
    }

}

