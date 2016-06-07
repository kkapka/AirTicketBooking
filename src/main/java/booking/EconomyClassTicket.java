package booking;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EconomyClassTicket implements Ticket{
	public void createTicket(String name,String surname,int age,String sex,String from,String to,String price) throws IOException{
		FileWriter writer=null;
		
		 writer=new FileWriter("ticket.csv");
		 writer.append(";;;;Economy Class Ticket;;;;\n");
		 writer.append("\n");
		 
		 writer.append("Name");
		 writer.append(";");
		 writer.append("Surname");
		 writer.append(";");
		 writer.append("Age");
		 writer.append(";");
		 writer.append("Sex");
		 writer.append("\n");
		 
		 writer.append(name);
		 writer.append(";");
		 writer.append(surname);
		 writer.append(";");
		 writer.append(Integer.toString(age));
		 writer.append(";");
		 writer.append(sex);
		 writer.append("\n");
		 
		 writer.append("\n");
		 
		 writer.append("Start Airport");
		 writer.append(";");
		 writer.append("End Airport");
		 writer.append(";");
		 writer.append("Ticket Price");
		 writer.append("\n");
		 
		 writer.append(from);
		 writer.append(";");
		 writer.append(to);
		 writer.append(";");
		 writer.append(price);
		 
		 writer.flush();
		 writer.close();
		 
		 Desktop dt = Desktop.getDesktop();
		 dt.open(new File("ticket.csv"));
		
	}
}
