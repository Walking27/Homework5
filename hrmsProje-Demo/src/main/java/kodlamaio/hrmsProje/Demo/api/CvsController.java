package kodlamaio.hrmsProje.Demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.hrmsProje.Demo.business.abstracts.CvService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.entities.concretes.Cv;

@RestController
@RequestMapping("/api/cvs")
public class CvsController {
	
	private CvService cvService;

	public CvsController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Cv>> getAll() {
		return this.cvService.getAll();
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody Cv cv) {
		this.cvService.add(cv);
		return new SuccessDataResult<Cv>("Cv Added");
	}

}
