package booking;

import java.math.BigDecimal;

public class Flight {
	private String flightNumber;
	private Airport to;
	private Airport from;
	
	//	pricing:
	//			0 - Economy Class
	//			1 - Economy Plus Class
	//			2 - Business Class
	private BigDecimal[] pricing=new BigDecimal[3];
	
	public Flight(String flightNumber,Airport to,Airport from,BigDecimal economyPrice,
				BigDecimal economyPlusPrice,BigDecimal businessPrice) {
		this.flightNumber=flightNumber;
		this.to=to;
		this.from=from;
		
		this.pricing[0]=economyPrice;
		this.pricing[1]=economyPlusPrice;
		this.pricing[2]=businessPrice;
	}
	
	public String getFlightNumber(){
		return flightNumber;
	}
	
	public Airport getTo(){
		return to;
	}
	
	public Airport getFrom(){
		return from;
	}
	
	public String viewFlight(int currencyNumber,BigDecimal money){
				return "From "+this.from.getCity()+"("+this.from.getIATA()+")"+","+this.from.getCountry()+" to "+
				this.to.getCity()+"("+this.to.getIATA()+")"+","+this.to.getCountry()+" "+
				new ChooseConvert().choose(currencyNumber).convert(money).toString()+" "+
				new ChooseCurrencyName().get(currencyNumber);
	}

	public BigDecimal[] getPricing() {
		return pricing;
	}

	public void setPricing(BigDecimal[] pricing) {
		this.pricing = pricing;
	}
}