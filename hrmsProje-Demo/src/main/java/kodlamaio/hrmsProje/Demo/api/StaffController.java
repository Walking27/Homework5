package kodlamaio.hrmsProje.Demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrmsProje.Demo.business.abstracts.StaffService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.Staff;

@RestController
@RequestMapping("/api/staffes")
public class StaffController {

    private StaffService staffService;

	public StaffController(StaffService staffService) {
		super();
		this.staffService = staffService;
	}
	@GetMapping("/getall")
	public DataResult<List<Staff>>  getall(){
		return this.staffService.getAll();
		
}
	
	@PostMapping("/add")
	public Result add(@RequestBody Staff staff) {
		return this.staffService.add(staff);
	}
}
