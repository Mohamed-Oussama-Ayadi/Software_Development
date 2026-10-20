package tn.esprit.exam.service;

import tn.esprit.exam.entity.Programme;

import java.util.List;

public interface IProgrammeService {

    public List<Programme> retrieveAllProgrammes();
    public Programme retrieveProgramme(Long programmeId);
    public Programme ajouterProgramme(Programme c);
    public void removeProgramme(Long programmeId);
    public Programme modifyProgramme(Programme programme);
    public Programme ajouterProgrammeAndAssignProgrammeToChaine(Programme projet, Long projetDetailId);

    // Here we will add if any method calling keywords or JPQL


}
