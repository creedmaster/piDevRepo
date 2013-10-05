package tn.edu.esprit.piDev.artOfDev.liveUp.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	
	private int idEvent;
	private String desciption;
	private int minute;
	private String []  type = {"corner" , "foul" , "offside" , "penalty" , "goal" , "red card" , "yellow card" , "injury" , "substitute" , "match over" , "half time" ,"other"};
	private Game game ;

	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.AUTO)

	public int getIdEvent() {
		return this.idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}   
	public String getDesciption() {
		return this.desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}   
	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	
	public String[] getType() {
		return type;
	}
	public void setType(String[] type) {
		this.type = type;
	}
	
	@ManyToOne
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
   
}
