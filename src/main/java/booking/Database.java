package booking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;

//singleton design pattern

public class Database {

	private static Database instance;
	
	private static ArrayList<Flight> flightsList;
	private static ArrayList<Airport> airportsList;
	private static ArrayList<Ticket> ticketsList;
	private static ArrayList<Flight> resultList;
	
	private Database() throws FileNotFoundException{
		flightsList=new ArrayList<Flight>();
		airportsList=new ArrayList<Airport>();
		ticketsList=new ArrayList<Ticket>();
		resultList=new ArrayList<Flight>();
		
		initAirports();
		initFlights();
	}

	public static Database getInstance() throws FileNotFoundException{
		if(instance==null) instance=new Database();
		return instance;
	}

	public ArrayList<Flight> getFlightsList() {
		return Database.flightsList;
	}

	public void setFlightsList(ArrayList<Flight> flightsList) {
		Database.flightsList = flightsList;
	}

	public ArrayList<Airport> getAirportsList() {
		return Database.airportsList;
	}

	public void setAirportsList(ArrayList<Airport> airportsList) {
		Database.airportsList = airportsList;
	}

	public ArrayList<Ticket> getTicketsList() {
		return Database.ticketsList;
	}

	public void setTicketsList(ArrayList<Ticket> ticketsList) {
		Database.ticketsList = ticketsList;
	}

	public ArrayList<Flight> getResultList() {
		return Database.resultList;
	}

	public void setResultList(ArrayList<Flight> resultList) {
		Database.resultList = resultList;
	}
	
	private void initAirports() throws FileNotFoundException{
		
		String line;
		
		InputStreamReader isr=new InputStreamReader(getClass().getResourceAsStream("/airports.txt"));
		BufferedReader br=new BufferedReader(isr);
		
		try {
			while((line=br.readLine())!=null){
				String[] words=line.split(" ");
				airportsList.add(new Airport(words[0], words[1], words[2]));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		airportsList.add(new Airport("WAW", "Warsaw", "Poland"));
		airportsList.add(new Airport("KRK", "Krakow", "Poland"));
		airportsList.add(new Airport("MUC", "Munich", "Germany"));
		airportsList.add(new Airport("FRA", "Frankfurt", "Germany"));
		airportsList.add(new Airport("LHR", "London", "England"));
		airportsList.add(new Airport("STN", "London", "England"));
		airportsList.add(new Airport("STN", "London", "England"));
		*/
	}
	
	private void initFlights() throws FileNotFoundException{
		
		String line;
		
		InputStreamReader isr=new InputStreamReader(getClass().getResourceAsStream("/flights.txt"));
		BufferedReader br=new BufferedReader(isr);
		
		try {
			while((line=br.readLine())!=null){
				String[] words=line.split(" ");
				flightsList.add(new Flight(words[0], airportsList.get(Integer.parseInt(words[1])), airportsList.get(Integer.parseInt(words[2])),new BigDecimal(words[3]),new BigDecimal(words[4]),new BigDecimal(words[5])));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		//flights from Warsaw
		flightsList.add(new Flight("1", airportsList.get(0), airportsList.get(1),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		flightsList.add(new Flight("2", airportsList.get(0), airportsList.get(2),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		flightsList.add(new Flight("3", airportsList.get(0), airportsList.get(3),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		flightsList.add(new Flight("4", airportsList.get(0), airportsList.get(4),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		flightsList.add(new Flight("5", airportsList.get(0), airportsList.get(5),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		
		//Flights from Krakow
		flightsList.add(new Flight("6", airportsList.get(1), airportsList.get(0),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		flightsList.add(new Flight("7", airportsList.get(1), airportsList.get(2),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		flightsList.add(new Flight("8", airportsList.get(1), airportsList.get(3),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		flightsList.add(new Flight("9", airportsList.get(1), airportsList.get(4),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		flightsList.add(new Flight("10", airportsList.get(1), airportsList.get(5),new BigDecimal("100"),new BigDecimal("200"),new BigDecimal("300")));
		*/
	}
}