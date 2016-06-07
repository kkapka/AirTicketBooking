package booking;

public class Airport {
	//International Air Transport Association airport code
	private String IATA;
	
	//Location
	private String city;
	private String country;
	
	public Airport(String IATA,String city,String country) {
		this.IATA=IATA;
		this.city=city;
		this.country=country;
	}
	
	public String getIATA(){
		return this.IATA;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getCountry(){
		return this.country;
	}
}