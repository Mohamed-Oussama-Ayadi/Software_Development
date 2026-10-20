package tn.esprit.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Car;
import tn.esprit.entities.Driver;
import tn.esprit.entities.Owner;
import tn.esprit.entities.Status;
import tn.esprit.services.IExamService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("rest")
@RequiredArgsConstructor
public class ExamRestController {
	private final IExamService examService;




//
//	//http://localhost:9090/rest/add-Owner
	@PostMapping("/add-Owner")
	public Owner ajouterOwner(@RequestBody Owner owner) {
		return	examService.addOwner(owner);
	}

	//	//http://localhost:9090/rest/add-Driver
	@PostMapping("/add-Driver")
	public Driver ajouterDriver(@RequestBody Driver driver) {
		return	examService.addDriver(driver);
	}

	//http://localhost:9090/rest/add-Car
	@PostMapping("/add-Car/{ownerId}")
	public Car ajouterClasse(@RequestBody Car car,@PathVariable long ownerId) {
		return examService.addCarAndAssignToOwner(car, ownerId);
	}
//
//
//	//http://localhost:9090/rest/add-CoursClassroom/{codeClasse}
//	@PostMapping("/add-CoursClassroom/{codeClasse}")
//	public CoursClassroom ajouterCoursClassroom(@RequestBody CoursClassroom coursClassroom,@PathVariable int codeClasse) {
//		return	examService.ajouterCoursClassroom(coursClassroom,codeClasse);
//	}
//
//
//	//http://localhost:9090/rest/affecterUtilisateurClasse/{idUtilisateur}/{codeClasse}
//	@PutMapping("/affecterUtilisateurClasse/{idUtilisateur}/{codeClasse}")
//	public void affecterUtilisateurClasse(@PathVariable int idUtilisateur, @PathVariable Integer codeClasse ) {
//		examService.affecterUtilisateurClasse(idUtilisateur,codeClasse);
//	}
//
//
//	//http://localhost:9090/rest/desaffecterCoursClassroomClasse/{idCours}
//	@PutMapping("/desaffecterCoursClassroomClasse/{idCours}")
//	public void desaffecterCoursClassroomClasse(@PathVariable Integer idCours) {
//		examService.desaffecterCoursClassroomClasse(idCours);
//	}
//
//
	//http://localhost:9090/rest/retriveDriversByStatus/{status}
	@GetMapping("/retriveDriversByStatus/{status}")
	public List<Driver> retriveDriversByStatus(@PathVariable Status status) {
		return examService.retriveDriversByStatus(status);
	}
//
//	//http://localhost:9090/rest/nbHeuresParSpecEtNiv/{specialite}/{niveau}
//	@GetMapping("/nbHeuresParSpecEtNiv/{specialite}/{niveau}")
//	public Integer nbHeuresParSpecEtNiv(@PathVariable Specialite specialite, @PathVariable Niveau niveau) {
//		return examService.nbHeuresParSpecEtNiv(specialite,niveau);
//	}



}
