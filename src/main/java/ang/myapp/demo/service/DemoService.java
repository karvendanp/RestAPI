package ang.myapp.demo.service;

import java.util.List;
import java.util.Optional;

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
   public Country getCountry(String code) {
	   try
	   {
		   Optional<Country> country = countryRepository.findById(code);
		   if(country.isPresent()) {
		     return country.get();
		   }
		   return null;
	   }
	   catch(Exception e) {
			return null;
		}
   }
   
   public Boolean saveCountry(String code,Country country) throws Exception {
	   try
	   {
		   Country _country = countryRepository.findById(code).orElseThrow(null);
		   if(_country != null) {
			   _country.setContinent(country.getContinent());
			   _country.setName(country.getName());
			   countryRepository.save(_country);
			   return true;
		   }
		   return false;
	   }
	   catch(Exception e) {
			throw new Exception();
		}
   }
   public Boolean deleteCountry(String code) {
	   try
	   {
		   countryRepository.deleteById(code);
		   return true;
	   }
	   catch(Exception e) {
			return false;
		}
   } 
}
