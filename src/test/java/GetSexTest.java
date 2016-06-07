import static org.junit.Assert.*;

import org.junit.Test;

import booking.OrderDetailsModel;

public class GetSexTest {

	@Test
	public void test() {
		OrderDetailsModel test=new OrderDetailsModel();
		assertEquals("female", test.getSex(2));
	}

}
