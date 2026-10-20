package tn.esprit.tp8salmadamak4erpbi4.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp8salmadamak4erpbi4.entity.ProjetDetail;
import tn.esprit.tp8salmadamak4erpbi4.repository.ProjetDetailRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class ProjetDetailServiceImpl implements IProjetDetailService{
ProjetDetailRepository projetDetailRepository;
    public List<ProjetDetail> retrieveAllProjetDetails(){
        return projetDetailRepository.findAll();
    }
    public ProjetDetail retrieveProjetDetail(Long idProjetDetail){
        return projetDetailRepository.findById(idProjetDetail).get();
    }

    public ProjetDetail addProjetDetail(ProjetDetail e) {
        return projetDetailRepository.save(e);
    }

    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    public void removeProjetDetail(Long idProjetDetail) {
        projetDetailRepository.deleteById(idProjetDetail);
    }
}
