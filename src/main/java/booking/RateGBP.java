package booking;

import java.math.BigDecimal;

public class RateGBP extends ExchangeRates{
	@Override
	BigDecimal getRate() {
		return gbpRate;
	}
}