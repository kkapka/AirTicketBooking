package booking;

import java.sql.Date;

public class Customer {
	private String name;
	private String surname;
	private Date dateOfBirth;
	private String street;
	private String country;
	
	public Customer(String name,String surname,Date dateOfBirth,String street,String country) {
		this.setName(name);
		this.setSurname(surname);
		this.setDateOfBirth(dateOfBirth);
		this.setStreet(street);
		this.setCountry(country);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}