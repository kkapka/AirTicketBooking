package booking;

import java.io.FileNotFoundException;

public class SearchFlightModel {
	Database database;
	
	public SearchFlightModel() throws FileNotFoundException {
		database=Database.getInstance();
	}
	
	void search(String from,String to,int searchType){
		//		search type
		//		1 - direct connection
		//		2 - available destination
		//		3 - start point
		
		//making space for new searching results		
		database.getResultList().clear();
		
		if(searchType==1){
			for(int i =0;i<database.getFlightsList().size();i++){
				if(database.getFlightsList().get(i).getFrom().getCity().equals(from) && database.getFlightsList().get(i).getTo().getCity().equals(to)){
					database.getResultList().add(database.getFlightsList().get(i));
				}
			}
		}
		else if(searchType==2){
			for(int i =0;i<database.getFlightsList().size();i++){
				if(database.getFlightsList().get(i).getFrom().getCity().equals(from)){
					database.getResultList().add(database.getFlightsList().get(i));
				}
			}
		}
		else if(searchType==3){
			for(int i =0;i<database.getFlightsList().size();i++){
				if(database.getFlightsList().get(i).getTo().getCity().equals(to)){
					database.getResultList().add(database.getFlightsList().get(i));
				}
			}
		}
	}
}
