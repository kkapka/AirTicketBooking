package booking;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class OrderDetailsView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel mainPanel;
	JLabel headerText;
	JLabel nameText;
	JLabel surnameText;
	JLabel ageText;
	JLabel sexText;
	JLabel fromText;
	JLabel toText;
	JLabel priceText;
	JLabel fromAirportText;
	JLabel toAirportText;
	JLabel ticketPriceText;
	JButton printButton;
	JTextField nameField;
	JTextField surnameField;
	JTextField ageField;
	JRadioButton maleOption;
	JRadioButton femaleOption;
	ButtonGroup sexButtonGroup;
	
	
	public OrderDetailsView() {
		
		setTitle("Order details:");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		elementsConfig();
		layoutConfig();
		addingElementsToMainPanel();
		
		add(mainPanel);
		pack();
		setVisible(true);
	}
	
	private void elementsConfig(){
		mainPanel=new JPanel();
		headerText=new JLabel("Write your personal details:");
		nameText=new JLabel("name:");
		surnameText=new JLabel("surname:");
		ageText=new JLabel("age:");
		sexText=new JLabel("sex:");
		fromText=new JLabel("from");
		toText=new JLabel("to");
		priceText=new JLabel("price:");
		fromAirportText=new JLabel();
		toAirportText=new JLabel();
		ticketPriceText=new JLabel();
		printButton=new JButton("Print");
		nameField=new JTextField(10);
		surnameField=new JTextField(10);
		ageField=new JTextField(3);
		maleOption=new JRadioButton("male");
		femaleOption=new JRadioButton("female");
		sexButtonGroup=new ButtonGroup();
	}
	
	private void addingElementsToMainPanel(){
		sexButtonGroup.add(maleOption);
		sexButtonGroup.add(femaleOption);
		
		mainPanel.add(headerText,"wrap");
		mainPanel.add(nameText,"split 3");
		mainPanel.add(nameField);
		mainPanel.add(surnameText);
		mainPanel.add(surnameField,"wrap");
		mainPanel.add(ageText,"split 4");
		mainPanel.add(ageField);
		mainPanel.add(sexText);
		mainPanel.add(maleOption);
		mainPanel.add(femaleOption,"wrap");
		mainPanel.add(fromText,"split 3");
		mainPanel.add(fromAirportText);
		mainPanel.add(toText);
		mainPanel.add(toAirportText,"wrap");
		mainPanel.add(priceText,"split 2");
		mainPanel.add(ticketPriceText,"wrap");
		mainPanel.add(printButton);
	}
	
	private void layoutConfig(){
		MigLayout mainPanelLayout=new MigLayout("","[grow,fill]");
		mainPanel.setLayout(mainPanelLayout);
	}
	
	public String getName(){
		return nameField.getText();
	}
	
	String getSurname(){
		return surnameField.getText();
	}

	int getAge(){
		return Integer.parseInt(ageField.getText());
	}
	
	boolean isSelectedMale(){
		return maleOption.isSelected();
	}
	
	boolean isSelectedFemale(){
		return femaleOption.isSelected();
	}
	
	void setFromAirport(String airp){
		fromAirportText.setText(airp);
	}
	
	void setToAirport(String airp){
		toAirportText.setText(airp);
	}
	
	void setPrice(String price){
		ticketPriceText.setText(price);
	}
	
	String getPrice(){
		return ticketPriceText.getText();
	}
	
	void addPrintButtonActionListener(ActionListener listener){
		printButton.addActionListener(listener);
	}
}
