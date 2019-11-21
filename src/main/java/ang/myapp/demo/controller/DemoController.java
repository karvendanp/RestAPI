package ang.myapp.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ang.myapp.demo.model.Country;
import ang.myapp.demo.service.DemoService;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/country")
	public List<Country> getAllNotes() {
	    return demoService.getAllCountries();
	}

}
