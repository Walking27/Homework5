package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School,Integer> {
}
