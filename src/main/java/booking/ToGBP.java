package booking;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ToGBP implements CashConvert{
	public BigDecimal convert(BigDecimal money) {
		return money.divide(new RateGBP().getRate(),4,RoundingMode.HALF_UP);
	}

	public String getName() {
		return "GBP";
	}
}
