package kodlamaio.hrmsProje.Demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Table(name="cities")
    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
public class City {
	@Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="city_id")
	private int id;

	@Column(name="firstName")
	private String firstName;

	public City(int id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
