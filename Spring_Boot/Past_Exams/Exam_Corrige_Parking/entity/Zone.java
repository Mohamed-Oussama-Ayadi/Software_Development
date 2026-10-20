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
public class Zone  {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id; 
	
	private String ref;
	
	private float dimension; 
	
	@OneToMany(mappedBy="zoneGarde")
	private List<Personnel> personnels;
	
	@OneToOne
	private Personnel personnel;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Parking parking;

}
