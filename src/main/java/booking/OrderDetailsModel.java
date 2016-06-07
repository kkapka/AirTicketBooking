package booking;

import java.io.IOException;

public class OrderDetailsModel {
	void printTicket(String name,String surname,int age,int sex,String from,String to,String price) throws IOException{
		new TicketFactory().factory().createTicket(name, surname, age, getSex(sex), from, to, price);
	}
	
	public String getSex(int n){
		if(n==1){
			return "male";
		}
		else if(n==2){
			return "female";
		}
		else{
			return null;
		}
	}
}
