import static org.junit.Assert.*;

import org.junit.Test;

import booking.CustomerPreferences;
import booking.EconomyClassTicket;
import booking.TicketFactory;

public class TicketFactoryTest {

	@Test
	public void test() {
		EconomyClassTicket ticket1=new EconomyClassTicket();
		CustomerPreferences pref=CustomerPreferences.getInstance();
		pref.setTypeOfTicket(0);
		assertEquals(ticket1.getClass(), new TicketFactory().factory().getClass());
	}
}