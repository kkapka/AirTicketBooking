package booking;

import java.math.BigDecimal;

public class RateUSD extends ExchangeRates{
	@Override
	BigDecimal getRate() {
		return usdRate;
	}
}