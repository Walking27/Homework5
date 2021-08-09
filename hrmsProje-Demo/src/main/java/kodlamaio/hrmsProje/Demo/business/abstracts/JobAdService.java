package kodlamaio.hrmsProje.Demo.business.abstracts;

import java.util.List;

import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.JobAd;


public interface JobAdService {
	Result add(JobAd jobAd);
    DataResult<List<JobAd>> getAll();
}