package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.JobAdService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.JobAdDao;

import kodlamaio.hrmsProje.Demo.entities.concretes.JobAd;


@Service
public class JobAdManager implements JobAdService {

    private JobAdDao jobAdDao;
    
    public JobAdManager(JobAdDao jobAdDao) {
		super();
		this.jobAdDao = jobAdDao;
	}

    @Override
    public DataResult<List<JobAd>> getAll() {
        return new SuccessDataResult<List<JobAd>>
        (this.jobAdDao.findAll(),"Data listelendi");
    }

	@Override
	public Result add(JobAd jobAd) {
		this.jobAdDao.save(jobAd);
		return new SuccessResult("Ürün Eklendi");
	}

	
}