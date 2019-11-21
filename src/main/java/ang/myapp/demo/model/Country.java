package ang.myapp.demo.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="country")
public class Country implements Serializable {
	
	@Id
	private String code;
	
	@Column(nullable = false,name = "Name")
	private String name;
	
	@Column(name = "Continent")
	private String continent;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	

}
