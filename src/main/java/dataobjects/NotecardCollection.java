package dataobjects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NotecardCollection {
	private @Id User owner;
	private String name;
	private int size;
	
	public NotecardCollection(User owner, String name, int size) {
		this.owner = owner;
		this.name = name;
		this.size = size;
	}
	
}
