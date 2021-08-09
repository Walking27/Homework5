package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.CityService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.CityDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.City;

@Service
public class CityManager implements CityService{
	
	private CityDao cityDao;

	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	 @Override
	    public DataResult<List<City>> getAll() {
	        return new SuccessDataResult<List<City>>
	        (this.cityDao.findAll(),"Data listelendi");
	    }

	 @Override
		public Result add(City city) {
			this.cityDao.save(city);
			return new SuccessResult("Ürün Eklendi");
			
		}

	 
	
	

}
