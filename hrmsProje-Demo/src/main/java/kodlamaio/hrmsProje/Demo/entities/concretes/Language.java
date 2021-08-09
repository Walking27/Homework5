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

@Entity
@Table(name = "languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "level")
    private String level;

    public Language(int id, String name, String level) {
		super();
		this.id = id;
		this.firstName = name;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return firstName;
	}

	public String getLevel() {
		return level;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.firstName = name;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}

