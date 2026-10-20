package tn.esprit.tp8salmadamak4erpbi4.control;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp8salmadamak4erpbi4.entity.ProjetDetail;
import tn.esprit.tp8salmadamak4erpbi4.service.IProjetDetailService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/ProjetDetail")

public class ProjetDetailRestController {
    IProjetDetailService projetDetailService;
    
    @GetMapping("/retrieve-all-projetDetails")
    public List<ProjetDetail> getProjetDetails() {
        List<ProjetDetail> listProjetDetails = projetDetailService.retrieveAllProjetDetails();
        return listProjetDetails;
    }

    @GetMapping("/retrieve-projetDetail/{projetDetail-id}")
    public ProjetDetail retrieveProjetDetail(@PathVariable("projetDetail-id") Long idProjetDetail) {
        ProjetDetail projetDetail = projetDetailService.retrieveProjetDetail(idProjetDetail);
        return projetDetail;
    }
    @PostMapping("/add-projetDetail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail e) {
        ProjetDetail projetDetail = projetDetailService.addProjetDetail(e);
        return projetDetail;
    }
    @DeleteMapping("/remove-projetDetail/{projetDetail-id}")
    public void removeProjetDetail(@PathVariable("projetDetail-id") Long idProjetDetail) {
        projetDetailService.removeProjetDetail(idProjetDetail);
    }

    @PutMapping("/modify-projetDetail")
    public ProjetDetail modifyProjetDetail(@RequestBody ProjetDetail e) {
        ProjetDetail projetDetail = projetDetailService.modifyProjetDetail(e);
        return projetDetail;
    }
}
