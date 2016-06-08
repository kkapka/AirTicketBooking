package booking;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String[] argv) throws FileNotFoundException {		
		
		SearchFlightView view=new SearchFlightView();
		SearchFlightModel model=new SearchFlightModel();
		
		new SearchFlightController(view, model);
	}
}