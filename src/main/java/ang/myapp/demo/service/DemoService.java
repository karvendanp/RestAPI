package ang.myapp.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ang.myapp.demo.model.Country;
import ang.myapp.demo.repository.CountryRepository;

@Service
public class DemoService {
	
	@Autowired
	CountryRepository countryRepository;
	
	public List<Country> getAllCountries(){
		try {
			
			List<Country> countries = countryRepository.findAll();
			return countries;
		}
		catch(Exception e) {
			return null;
		}
		
	}

}
