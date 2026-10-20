package tn.esprit.tpfoyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.entity.Reservation;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy

public class TpFoyerApplication {
/*class main de mon projet*/
    public static void main(String[] args) {
        SpringApplication.run(TpFoyerApplication.class, args);
    }

}


