import static org.junit.Assert.*;

import org.junit.Test;

import booking.Customer;

public class CustomerTest {

	@Test
	public void test() {
		Customer test=new Customer("Ann", "Einstein", null, "homeless", "World");
		assertEquals("Ann", test.getName());
	}

}
