package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.CvService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.CvDto;
import kodlamaio.hrmsProje.Demo.entities.concretes.Cv;

@Service
public class CvManager implements CvService {

	private CvDto cvDao;
	@Autowired
	public CvManager(CvDto cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		return new SuccessDataResult<List<Cv>>
		(this.cvDao.findAll(), "Listed");
	}

	@Override
	public Result add(Cv cv) {	
		return new SuccessDataResult<Cv>
		(this.cvDao.save(cv), "Liste Eklendi");
	}

	

}
