package kodlamaio.hrmsProje.Demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.hrmsProje.Demo.business.abstracts.LanguageService;
import kodlamaio.hrmsProje.Demo.core.utilites.result.DataResult;
import kodlamaio.hrmsProje.Demo.core.utilites.result.Result;
import kodlamaio.hrmsProje.Demo.entities.concretes.Language;

@RestController
@RequestMapping("/api/language")
public class LanguagesContoller {

    private LanguageService languageService;

	public LanguagesContoller(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public DataResult<List<Language>>  getall(){
		return this.languageService.getAll();
}
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
}
