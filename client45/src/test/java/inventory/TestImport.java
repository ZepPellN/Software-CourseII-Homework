package inventory;

import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;

import org.junit.Test;

import state.ResultMessage;
import vo.receiptvo.InventoryImportReceiptVO;

public class TestImport {
	private ResultMessage SUCCESS;

	@Test
	public void testImport() throws RemoteException {
		InventoryImportReceiptVO importReceipt = null;
		MockInventoryImport test = new MockInventoryImport();
		assertEquals("1", test.getImportID());
		assertEquals("nanjing520", test.getCommodities());
		assertEquals("nanjing", test.getDestination());

		assertEquals(SUCCESS, test.submitImport(importReceipt));
	}

}
