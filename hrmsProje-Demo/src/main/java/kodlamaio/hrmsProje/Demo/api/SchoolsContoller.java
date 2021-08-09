package kodlamaio.hrmsProje.Demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrmsProje.Demo.business.abstracts.SchoolService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.Employee;
import kodlamaio.hrmsProje.Demo.entities.concretes.School;

@RestController
@RequestMapping("/api/schools")
public class SchoolsContoller {

    private SchoolService schoolService;

	public SchoolsContoller(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	@GetMapping("/getall")
	public DataResult<List<School>>  getall(){
		return this.schoolService.getAll();
		
}
	
	@PostMapping("/add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
}
