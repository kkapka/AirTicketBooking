package booking;

import java.math.BigDecimal;

public class RatePLN extends ExchangeRates {
	@Override
	BigDecimal getRate() {
		return plnRate;
	}
}