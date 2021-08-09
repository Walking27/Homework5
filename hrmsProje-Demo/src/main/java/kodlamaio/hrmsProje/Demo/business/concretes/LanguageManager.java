package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.LanguageService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.LanguageDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.Candidate;
import kodlamaio.hrmsProje.Demo.entities.concretes.Cv;
import kodlamaio.hrmsProje.Demo.entities.concretes.JobAd;
import kodlamaio.hrmsProje.Demo.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

    private LanguageDao languageDao;

	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<List<Language>>
        (this.languageDao.findAll(),"Data listelendi");
    }

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Ürün Eklendi");
	}
}