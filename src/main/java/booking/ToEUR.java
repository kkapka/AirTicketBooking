package booking;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ToEUR implements CashConvert{
	public BigDecimal convert(BigDecimal money) {
		return money.divide(new RateEUR().getRate(),4,RoundingMode.HALF_UP);
	}

	public String getName() {
		return "EUR";
	}
	
}