package booking;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class SearchFlightView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel;
	private JLabel headerText;
	private JLabel fromText;
	private JLabel toText;
	private JLabel searchChoiceText;
	private JLabel currencyChoiceText;
	private JLabel classChoiceText;
	private ButtonGroup searchChoiceButtonGroup;
	private ButtonGroup currencyChoiceButtonGroup;
	private ButtonGroup classChoiceButtonGroup;
	private JRadioButton directConnectionOption;
	private JRadioButton availableDestinationsOption;
	private JRadioButton startAirportOption;
	private JRadioButton usdOption;
	private JRadioButton eurOption;
	private JRadioButton gbpOption;
	private JRadioButton plnOption;
	private JRadioButton economyClassOption;
	private JRadioButton economyPlusClassOption;
	private JRadioButton businessClassOption;
	private JTextField from;
	private JTextField to;
	private JButton bookButton;
	private JButton searchButton;
	private DefaultListModel<String> listModel;
	private JList<String> resultsTable;
	private JScrollPane resultsScrollPanel;
	
	public SearchFlightView() {
		this.setTitle("Air Ticket Booking");
		this.setLocationRelativeTo(null);
		
		elementsConfig();
		layoutConfig();
		addingElementsToMainPanel();
		
		this.add(mainPanel);
		this.pack();
		this.setVisible(true);
	}
	
	private void elementsConfig(){
		mainPanel=new JPanel();
		
		headerText=new JLabel("Write your starting point and destination:");
		fromText=new JLabel("from");
		toText=new JLabel("to");
		searchChoiceText=new JLabel("Select a way of looking for tickets:");
		currencyChoiceText=new JLabel("Select a currency:");
		classChoiceText=new JLabel("Select a flight class:");
		
		from=new JTextField(10);
		to=new JTextField(10);
		
		searchChoiceButtonGroup=new ButtonGroup();
		currencyChoiceButtonGroup=new ButtonGroup();
		classChoiceButtonGroup=new ButtonGroup();
		
		bookButton=new JButton("Book");
		searchButton=new JButton("Search");
		directConnectionOption=new JRadioButton("direct connection");
		directConnectionOption.setSelected(true);
		availableDestinationsOption=new JRadioButton("available destination");
		startAirportOption=new JRadioButton("start airport");
		plnOption=new JRadioButton("PLN");
		plnOption.setSelected(true);
		usdOption=new JRadioButton("USD");
		eurOption=new JRadioButton("EUR");
		gbpOption=new JRadioButton("GBP");
		economyClassOption=new JRadioButton("economy");
		economyClassOption.setSelected(true);
		economyPlusClassOption=new JRadioButton("economy plus");
		businessClassOption=new JRadioButton("business");

		listModel=new DefaultListModel<String>();
		resultsTable=new JList<String>(listModel);
		resultsScrollPanel=new JScrollPane(resultsTable);
		
	}
	
	private void layoutConfig(){
		MigLayout mainPanelLayout=new MigLayout("","[grow,fill]");
		mainPanel.setLayout(mainPanelLayout);
	}
	
	private void addingElementsToMainPanel(){
		mainPanel.add(headerText,"wrap");
		mainPanel.add(fromText,"split 4");
		mainPanel.add(from);
		mainPanel.add(toText);
		mainPanel.add(to,"wrap");
		mainPanel.add(searchChoiceText,"split 3");
		
		searchChoiceButtonGroup.add(availableDestinationsOption);
		searchChoiceButtonGroup.add(directConnectionOption);
		searchChoiceButtonGroup.add(startAirportOption);
		
		mainPanel.add(directConnectionOption);
		mainPanel.add(availableDestinationsOption);
		mainPanel.add(startAirportOption,"wrap");
		mainPanel.add(currencyChoiceText,"split 4");
		
		currencyChoiceButtonGroup.add(plnOption);
		currencyChoiceButtonGroup.add(usdOption);
		currencyChoiceButtonGroup.add(eurOption);
		currencyChoiceButtonGroup.add(gbpOption);
		
		mainPanel.add(plnOption);
		mainPanel.add(usdOption);
		mainPanel.add(eurOption);
		mainPanel.add(gbpOption,"wrap");
		mainPanel.add(classChoiceText,"split 3");
		
		classChoiceButtonGroup.add(economyClassOption);
		classChoiceButtonGroup.add(economyPlusClassOption);
		classChoiceButtonGroup.add(businessClassOption);
		
		mainPanel.add(economyClassOption);	
		mainPanel.add(economyPlusClassOption);
		mainPanel.add(businessClassOption,"wrap");
		mainPanel.add(searchButton,"wrap");
		
		mainPanel.add(resultsScrollPanel,"wrap");
		mainPanel.add(bookButton);
	}
	
	String getStartAirport(){
		return from.getText();
	}
	
	String getEndAirport(){
		return to.getText();
	}
	
	void addSearchButtonListener(ActionListener listener){
		searchButton.addActionListener(listener);
	}
	
	void addBookButtonListener(ActionListener listener){
		bookButton.addActionListener(listener);
	}
	
	boolean isSelectedDirectConnectionOption(){
		return directConnectionOption.isSelected();
	}
	
	boolean isSelectedAvailableDestinationsOption(){
		return availableDestinationsOption.isSelected();
	}
	
	boolean isSelectedStartAirportOption(){
		return startAirportOption.isSelected();
	}
	
	boolean isSelectedUsdOption(){
		return usdOption.isSelected();
	}
	
	boolean isSelectedPlnOption(){
		return plnOption.isSelected();
	}
	
	boolean isSelectedGbpOption(){
		return gbpOption.isSelected();
	}
	
	boolean isSelectedEurOption(){
		return eurOption.isSelected();
	}
	
	boolean isSelectedEconomyClassOption(){
		return economyClassOption.isSelected();
	}
	
	boolean isSelectedEconomyPlusClassOption(){
		return economyPlusClassOption.isSelected();
	}
	
	boolean isSelectedBusinessClassOption(){
		return businessClassOption.isSelected();
	}
	
	void clearResults(){
		listModel.clear();
	}
	
	void addResult(String element){
		listModel.addElement(element);
	}
	
	int choosenFlight(){
		return resultsTable.getSelectedIndex();
	}
}