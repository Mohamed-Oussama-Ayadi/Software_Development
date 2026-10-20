package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.*;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.ICandidatrepo;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IClientRepository;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IQuizrepo;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class ServicesImpl implements IServices {

    private final IClientRepository clientRepository;
    private final ICandidatrepo iCandidatrepo;
    private final IQuizrepo iquizrepo;
    @Override
    public Client add(Client client) {

        return clientRepository.save(client);
    }

    @Override
    public Candidat ajouterCandidat(Candidat candidat) {
        return iCandidatrepo.save(candidat);
    }

    @Override
    public Quiz ajouterQuiz(Quiz quiz) {
        return iquizrepo.save(quiz);
    }

    @Override
    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat) {
    Quiz    quiz = iquizrepo.findByTitreQuiz(titreQuiz);
    Candidat candidat=iCandidatrepo.findById(idCandidat).get();
    //On set le fils dans le parent
        quiz.getCandidats().add(candidat);

        return iquizrepo.save(quiz);
    }

    @Scheduled(cron = "*/15 * * * * *")
    @Override
    public void test() {
        log.info("testing");
    }

}
