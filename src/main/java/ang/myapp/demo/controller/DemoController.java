package ang.myapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ang.myapp.demo.model.Country;
import ang.myapp.demo.service.DemoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/country")
	public List<Country> getAllCountries() {
	    return demoService.getAllCountries();
	}
	@GetMapping("/country/{code}")
	public Country getCountry(@PathVariable("code")String code) {
	    return demoService.getCountry(code);
	}
	@PutMapping("/country")
	public Boolean updateCountry(@RequestBody Country country) throws Exception {
	    return demoService.saveCountry(country.getCode(),country);
	}
	/*@PostMapping("/country")
	public Boolean saveCountry(@RequestBody Country country) {
	    return demoService.saveCountry(country);
	}*/
}
