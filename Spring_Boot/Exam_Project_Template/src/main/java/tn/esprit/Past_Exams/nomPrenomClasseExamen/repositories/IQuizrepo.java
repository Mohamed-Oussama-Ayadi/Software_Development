package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Quiz;


@Repository
public interface IQuizrepo  extends JpaRepository<Quiz,Long> {

    Quiz findByTitreQuiz(String titreQuiz);


}
