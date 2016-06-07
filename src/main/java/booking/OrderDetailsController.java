package booking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OrderDetailsController {
	OrderDetailsView view;
	OrderDetailsModel model;
	CustomerPreferences pref;
	Database database;
	
	public OrderDetailsController(OrderDetailsView view,OrderDetailsModel model) throws FileNotFoundException {
		this.view=view;
		this.model=model;
		pref=CustomerPreferences.getInstance();
		database=Database.getInstance();
		
		view.setFromAirport(database.getResultList().get(pref.getChoosenFlight()).getFrom().getCity());
		view.setToAirport(database.getResultList().get(pref.getChoosenFlight()).getTo().getCity());
		view.setPrice(new ChooseConvert().choose(pref.getCurrencyNumber()).convert( 
				database.getResultList().get(pref.getChoosenFlight()).getPricing()[pref.getTypeOfTicket()]).toString()+" "+
				new ChooseCurrencyName().get(pref.getCurrencyNumber())
				);
	
		view.addPrintButtonActionListener(new PrintButtonListener());
	}

	
	class PrintButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			int tmp_sex = 0;
			
			if(view.isSelectedMale()){
				tmp_sex=1;
			}
			else if(view.isSelectedFemale()){
				tmp_sex=2;
			}
				
			try {
				if(view.getName().equals("") || view.getSurname().equals("")||view.getAge()==0||tmp_sex==0){
					throw new EmptyFieldException();
				}
				model.printTicket(view.getName(), view.getSurname(),view.getAge() ,
				tmp_sex,database.getResultList().get(pref.getChoosenFlight()).getFrom().getCity(),
				database.getResultList().get(pref.getChoosenFlight()).getTo().getCity(),
				view.getPrice());
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			catch(NumberFormatException e2){
				new MessageBox("Correct your age!","Error");
			}
			catch(EmptyFieldException e3){
				e3.displayMessage();
			}
		}
		
	}
}

class EmptyFieldException extends Exception
{
      /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyFieldException() {
	}
	
	void displayMessage(){
		new MessageBox("Blank field !!", "Warning");
	}
 }