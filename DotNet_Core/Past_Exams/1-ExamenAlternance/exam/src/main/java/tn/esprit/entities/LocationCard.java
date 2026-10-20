package tn.esprit.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class LocationCard implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long CardId;


	@Enumerated (EnumType.STRING)
	private Status status;

	private LocalDate LocalDate;

	@JsonIgnore
	@ManyToOne
	Driver driver;

}
