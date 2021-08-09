package kodlamaio.hrmsProje.Demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrmsProje.Demo.business.abstracts.JobAdService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.core.utilites.result.SuccessDataResult;
import kodlamaio.hrmsProje.Demo.entities.concretes.JobAd;

@RestController
@RequestMapping("/api/jobAd")
public class JobAdController {

	private JobAdService jobAdService;
	
	 public JobAdController(JobAdService jobAdService) {
			super();
			this.jobAdService = jobAdService;
		}
	 @GetMapping("/getall")
		public DataResult<List<JobAd>> getAll() {
			return this.jobAdService.getAll();
		}
		
		@PostMapping("/add")
		public Result add (@RequestBody JobAd jobAd) {
			this.jobAdService.add(jobAd);
			return new SuccessDataResult<JobAd>();
		}
}