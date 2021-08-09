package kodlamaio.hrmsProje.Demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrmsProje.Demo.business.abstracts.StaffService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessResult;
import kodlamaio.hrmsProje.Demo.dataAccesss.abstracts.StaffDao;
import kodlamaio.hrmsProje.Demo.entities.concretes.Staff;

@Service
public class StaffManager implements StaffService {

    private StaffDao staffDao;

	public StaffManager(StaffDao staffDao) {
		super();
		this.staffDao = staffDao;
	}

	@Override
	public Result add(Staff staff) {
		this.staffDao.save(staff);
		return new SuccessResult("Ürün Eklendi");
	}

	@Override
	public DataResult<List<Staff>> getAll() {
		return new SuccessDataResult<List<Staff>>
		(this.staffDao.findAll(),"Data Listelendi");
	}
}
