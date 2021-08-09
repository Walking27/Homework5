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
@Table(name="cv")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cv_id")
	private int id;

	@Column(name = "linkedin_adress")
	private String linkedinAdress;

	@Column(name = "github_adress")
	private String githubAdress;

	@Column(name = "cover_letter")
	private String coverLetter;
	
	
	public Cv(int id, String linkedinAdress, String githubAdress, String coverLetter) {
		super();
		this.id = id;
		this.linkedinAdress = linkedinAdress;
		this.githubAdress = githubAdress;
		this.coverLetter = coverLetter;
	}

	public int getId() {
		return id;
	}
	public String getLinkedinAdress() {
		return linkedinAdress;
	}

	public String getGithubAdress() {
		return githubAdress;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLinkedinAdress(String linkedinAdress) {
		this.linkedinAdress = linkedinAdress;
	}

	public void setGithubAdress(String githubAdress) {
		this.githubAdress = githubAdress;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}


}
