package tn.edu.esprit.pidev.artofdev.liveup.ejb.persistences;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Lambda
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class Lambda extends User implements Serializable  {

	
	private static final long serialVersionUID = 1L;

	public Lambda() {
		super();
	}
   
}
