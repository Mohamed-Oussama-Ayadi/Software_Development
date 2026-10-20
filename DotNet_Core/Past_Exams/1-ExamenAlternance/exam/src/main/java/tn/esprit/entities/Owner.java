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
public class Owner implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ownerId;

	private String firstName;

	private String lastName;


	@JsonIgnore
	@OneToMany
	private Set<Car> cars;


}
