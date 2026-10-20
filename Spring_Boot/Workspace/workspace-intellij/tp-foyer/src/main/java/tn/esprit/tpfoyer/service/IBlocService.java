package tn.esprit.tpfoyer.service;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long BlocId);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long BlocId);
    public Bloc modifyBloc(Bloc Bloc);
// Here we will add later methods calling keywords and methods calling JPQL
    public Bloc addFoyerAndBlocDetailAndAssign(Bloc bloc);
    public void assignfoyerTobloc(Long blocId, Long foyerId);
    public Bloc DesaffecterProjetDetailFromProjet(Long blocId);
}
