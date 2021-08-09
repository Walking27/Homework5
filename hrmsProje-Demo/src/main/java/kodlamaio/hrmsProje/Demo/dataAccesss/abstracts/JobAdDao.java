package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.JobAd;

public interface JobAdDao extends JpaRepository<JobAd,Integer> {
	
	List<JobAd> findByActive(boolean active);
    List<JobAd> findByActiveOrderByLastDate(boolean active);
    List<JobAd> findByActiveTrueAndEmployer_Id(int id);
	
}
