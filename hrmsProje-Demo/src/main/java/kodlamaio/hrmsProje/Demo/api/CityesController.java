package kodlamaio.hrmsProje.Demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrmsProje.Demo.business.abstracts.CityService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.Candidate;
import kodlamaio.hrmsProje.Demo.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CityesController {
	
	private CityService cityService;

	public CityesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>>  getall(){
		return this.cityService.getAll();
			
		}
	
	@PostMapping("/add")
	public Result add(@RequestBody City city) {
		return this.cityService.add(city);
	}

}
