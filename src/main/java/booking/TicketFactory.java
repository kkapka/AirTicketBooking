package booking;

//factory design pattern

public class TicketFactory {
	
	CustomerPreferences pref=CustomerPreferences.getInstance();
	Ticket ticket;
	
	public Ticket factory() {
		
		int typeOfTicket=pref.getTypeOfTicket();
		
		if(typeOfTicket==0){
			ticket=new EconomyClassTicket();
		}
		else if(typeOfTicket==1){
			ticket=new EconomyPlusClassTicket();
		}
		else if(typeOfTicket==2){
			ticket=new BusinessClassTicket();
		}
		else{
			ticket=null;
		}
		
		return ticket;
	}

}
