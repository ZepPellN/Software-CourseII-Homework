package inventory;

import po.receiptpo.InventoryImportReceiptPO;
import state.ResultMessage;
import vo.InventoryVO;
import vo.receiptvo.InventoryImportReceiptVO;

public class MockInventoryImport {

	private ResultMessage SUCCESS;

	public String getImportID() {
		return "1";
	}

	public String getCommodities() {

		return "nanjing520";
	}

	public String getDestination() {
		return "nanjing";
	}

	public InventoryVO addPlace() {

		return null;
	}

	public InventoryImportReceiptPO buildImport() {
		return null;


	}

	public ResultMessage submitImport(InventoryImportReceiptVO importReceipt) {

		return SUCCESS;
	}

}
