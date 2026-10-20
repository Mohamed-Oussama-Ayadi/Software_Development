package tn.esprit.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long carId;
	
	private String type;

	@JsonIgnore
	@OneToMany (mappedBy = "car")
	private Set<Reservation> reservations;






}
