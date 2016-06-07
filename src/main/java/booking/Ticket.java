package booking;

import java.io.IOException;

//factory design pattern

public interface Ticket {
	void createTicket(String name,String surname,int age,String sex,String from,String to,String price) throws IOException;
}