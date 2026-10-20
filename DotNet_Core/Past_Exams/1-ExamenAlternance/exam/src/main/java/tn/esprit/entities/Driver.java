package tn.esprit.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Driver implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long driverId;

	private String firstName;

	private String lastName;


	@OneToMany (mappedBy = "driver")
	private Set<LocationCard> locationCards;

	@JsonIgnore
	@OneToMany (mappedBy = "driver")
	private Set<Reservation> reservations;


}
