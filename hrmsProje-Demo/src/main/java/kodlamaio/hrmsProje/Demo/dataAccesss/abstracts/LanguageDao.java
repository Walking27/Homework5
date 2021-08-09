package kodlamaio.hrmsProje.Demo.dataAccesss.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrmsProje.Demo.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language,Integer> {
    
}
