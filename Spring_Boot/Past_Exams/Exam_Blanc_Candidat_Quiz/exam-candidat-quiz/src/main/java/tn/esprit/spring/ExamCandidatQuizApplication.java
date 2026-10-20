package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExamCandidatQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamCandidatQuizApplication.class, args);
	}

}
