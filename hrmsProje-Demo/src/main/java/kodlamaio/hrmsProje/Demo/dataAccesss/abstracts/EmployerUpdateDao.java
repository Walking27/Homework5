package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.EmployerUpdate;

public interface EmployerUpdateDao extends JpaRepository<EmployerUpdate, Integer>{

}
