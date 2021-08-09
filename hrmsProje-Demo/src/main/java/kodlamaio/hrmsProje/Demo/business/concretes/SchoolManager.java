package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.SchoolService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.SchoolDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.JobPosition;
import kodlamaio.hrmsProje.Demo.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService {
	
	public SchoolDao schoolDao;

	public SchoolManager(SchoolDao schoolDao) {
		super();
		this.schoolDao = schoolDao;
	}

	@Override
	public DataResult<List<School>>  getAll() {
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAll(),"DataListelendi");
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Ürün Eklendi");
	}
}
