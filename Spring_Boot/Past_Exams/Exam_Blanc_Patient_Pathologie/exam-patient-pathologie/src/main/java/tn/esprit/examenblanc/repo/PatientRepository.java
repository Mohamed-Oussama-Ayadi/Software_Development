package tn.esprit.examenblanc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {


    Patient findPatientByIdentifiantPieceIDentite(String identite);

}
