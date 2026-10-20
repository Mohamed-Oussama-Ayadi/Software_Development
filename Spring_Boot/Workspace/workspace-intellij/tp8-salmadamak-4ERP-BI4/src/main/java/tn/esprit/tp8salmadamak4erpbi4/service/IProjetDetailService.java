package tn.esprit.tp8salmadamak4erpbi4.service;

import tn.esprit.tp8salmadamak4erpbi4.entity.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    public List<ProjetDetail> retrieveAllProjetDetails();
    public ProjetDetail retrieveProjetDetail(Long idProjetDetail);
    public ProjetDetail addProjetDetail(ProjetDetail e);
    public void removeProjetDetail(Long idProjetDetail);
    public ProjetDetail modifyProjetDetail(ProjetDetail ProjetDetail);
}
