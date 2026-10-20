package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.TypeChambre;

import java.util.List;

public interface BlocRepository  extends JpaRepository<Bloc, Long> {
    Bloc findBlocBynomBloc(String nomBloc);
    List<Bloc> findAllBycapaciteBloc(Long cap);
}
