package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	
}
