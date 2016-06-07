import static org.junit.Assert.*;

import org.junit.Test;

import booking.ToPLN;

public class GetPlnNameTest {

	@Test
	public void test() {
		ToPLN test=new ToPLN();
		assertEquals("PLN", test.getName());
	}

}
