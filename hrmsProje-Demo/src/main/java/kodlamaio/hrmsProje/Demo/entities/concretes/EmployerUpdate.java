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

@Table(name="employerupdates")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployerUpdate {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employer_update_id ")
	private int employerUpdates;
	
	@Column(name = "employer_id ")
	private String employer_id;
	
	@Column(name = "companyname")
	private String company_name;
	
	@Column(name = "web_site")
	private String web_site;
	
	@Column(name = "phone_number")
	private String phone_number;
	
	@Column(name = "verifyed")
	private String verifyed;
	  
	public EmployerUpdate(int employerUpdates, String employer_id, String company_name, String web_site,
			String phone_number, String verifyed) {
		super();
		this.employerUpdates = employerUpdates;
		this.employer_id = employer_id;
		this.company_name = company_name;
		this.web_site = web_site;
		this.phone_number = phone_number;
		this.verifyed = verifyed;
	}

	public int getEmployerUpdates() {
		return employerUpdates;
	}

	public String getEmployer_id() {
		return employer_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public String getWeb_site() {
		return web_site;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public String getVerifyed() {
		return verifyed;
	}

	public void setEmployerUpdates(int employerUpdates) {
		this.employerUpdates = employerUpdates;
	}

	public void setEmployer_id(String employer_id) {
		this.employer_id = employer_id;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public void setWeb_site(String web_site) {
		this.web_site = web_site;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public void setVerifyed(String verifyed) {
		this.verifyed = verifyed;
	}

}
