package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.Cv;

public interface CvDto extends JpaRepository<Cv, Integer> {
	List<Cv> findById(int id);

}

