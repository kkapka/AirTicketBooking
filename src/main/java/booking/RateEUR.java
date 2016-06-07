package booking;

import java.math.BigDecimal;

public class RateEUR extends ExchangeRates{
	@Override
	BigDecimal getRate() {
		return eurRate;
	}
}
