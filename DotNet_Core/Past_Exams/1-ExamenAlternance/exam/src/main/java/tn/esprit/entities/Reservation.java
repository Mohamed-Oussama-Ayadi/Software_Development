package tn.esprit.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Reservation implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reservationId;

	private LocalDate startDate;

	private LocalDate endDate;

	@ManyToOne
	Driver driver;

	@ManyToOne
	Car car;

}
