package booking;

import java.math.BigDecimal;

//default tickets prices are in PLN

public abstract class ExchangeRates {
	
	//exchange rates from 23.05.2016 (NBP website)
	protected BigDecimal usdRate=new BigDecimal("3.9513");
	protected BigDecimal eurRate=new BigDecimal("4.4293");
	protected BigDecimal gbpRate=new BigDecimal("5.7449");
	protected BigDecimal plnRate=new BigDecimal("1.0");
	
	abstract BigDecimal getRate();
	
	void updateRates(){
		//TODO
		//code for updating exchange rates
	}
}
