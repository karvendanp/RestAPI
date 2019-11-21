package ang.myapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ang.myapp.demo.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
