package booking;

import java.math.BigDecimal;

//strategy design pattern

//this interface declares a method for converting currency
public interface CashConvert {
	BigDecimal convert(BigDecimal money);
	String getName();
}