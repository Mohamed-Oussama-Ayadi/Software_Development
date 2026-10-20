package tn.esprit.exam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Parking  {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id; 
	
	private String designation;
	
	private String adresse; 
	
	private int capacite; 	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="parking")
	private List<Zone> zones;

}
