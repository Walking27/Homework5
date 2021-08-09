package kodlamaio.hrmsProje.Demo.entities.concretes;



import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_ads")
public class JobAd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobAd_id")
    private int id;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToOne()
    @JoinColumn(name = "jobposition_id")
    private JobPosition jobPosition;

    @Column(name = "description")
    private String description;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "open_positions")
    private int openPositions;

    @Column(name = "last_date")
    private LocalDate lastDate;

    @Column(name = "active")
    private boolean active;

    @Column(name = "create_date")
    private LocalDate createDate;

	public JobAd(int id, Employer employer, JobPosition jobPosition, String description, City city, int minSalary,
			int maxSalary, int openPositions, LocalDate lastDate, boolean active, LocalDate createDate) {
		super();
		this.id = id;
		this.employer = employer;
		this.jobPosition = jobPosition;
		this.description = description;
		this.city = city;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.openPositions = openPositions;
		this.lastDate = lastDate;
		this.active = active;
		this.createDate = createDate;
	}

	public int getId() {
		return id;
	}

	public Employer getEmployer() {
		return employer;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public String getDescription() {
		return description;
	}

	public City getCity() {
		return city;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public int getOpenPositions() {
		return openPositions;
	}

	public LocalDate getLastDate() {
		return lastDate;
	}

	public boolean isActive() {
		return active;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public void setOpenPositions(int openPositions) {
		this.openPositions = openPositions;
	}

	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
}
