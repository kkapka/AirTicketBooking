package booking;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] argv) throws FileNotFoundException {		
		Database db=Database.getInstance();
		
		System.out.println(db.getAirportsList().size());
		
		SearchFlightView view=new SearchFlightView();
		SearchFlightModel model=new SearchFlightModel();
		
		new SearchFlightController(view, model);
	}
}