package tn.esprit.exam.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Personnel {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id; 
	
	private String login;
	private String pwd;
	private String nom;
	private String prenom;
	private int age;
	private Date dateRecrutement; 
	
	
	@Enumerated(EnumType.STRING)
	Poste poste; 
	
	@ManyToOne
	private Zone zoneGarde;
	
	@OneToOne(mappedBy="personnel")
	private Zone zoneResp;	
	

 
}
