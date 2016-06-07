package booking;

//singleton design pattern

public class CustomerPreferences {
	
	private static CustomerPreferences instance;
	
	//	default currency 0 - PLN
	//					 1 - USD
	//					 2 - GBP
	//					 3 - EUR
	private static int currency=0;

	//	type of ticket	0 - Economy Class
	//					1 - Economy Plus Class
	//					2 - Business Class
	private static int typeOfTicket=0;
	private static int choosenFlight;
	
	private CustomerPreferences(){
		//do nothing
	}
	
	public static CustomerPreferences getInstance(){
		if(instance==null) instance=new CustomerPreferences();
		return instance;
	}
	
	public int getCurrencyNumber() {
		return currency;
	}
	
	public void setCurrencyNumber(int currency) {
		CustomerPreferences.currency = currency;
	}

	public int getTypeOfTicket() {
		return typeOfTicket;
	}

	public void setTypeOfTicket(int typeOfTicket) {
		CustomerPreferences.typeOfTicket = typeOfTicket;
	}

	public int getChoosenFlight() {
		return choosenFlight;
	}

	public void setChoosenFlight(int choosenFlight) {
		CustomerPreferences.choosenFlight = choosenFlight;
	}
}