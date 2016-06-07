import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import booking.ToGBP;

public class ConvertToGbpTest {

	@Test
	public void test() {
		ToGBP test=new ToGBP();
		assertEquals(new BigDecimal("57.0000"), test.convert(new BigDecimal("327.4593")));
	}

}
