package inventory;

import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;

import org.junit.Test;

public class TestAdjust {
	@Test
	public void testAdjust() throws RemoteException {
		MockAdjust Test = new MockAdjust();
		MockPlaceBefore before = new MockPlaceBefore(null, 1, 1, 1, 1);
		MockPlaceAfter after = new MockPlaceAfter(null, null, 2, 2, 2, 2);
		Test.getAdjustID();
		Test.adjust(before, after);

		assertEquals("012345678", Test.getAdjustID());

	}

}
