package inventory;

import po.receiptpo.InventoryExportReceiptPO;
import state.ResultMessage;
import vo.InventoryVO;
import vo.receiptvo.InventoryExportReceiptVO;

public class MockInventoryExport {
	private ResultMessage SUCCESS = null;

	public String getExportID() {

		return "1";
	}

	public String getCommodities() {

		return "nanjing520";
	}

	public String getDestination() {

		return "nanjing";
	}

	public InventoryVO minusPlace() {
		return null;
	}

	public String getTransfer() {
		return "car";
	}

	public String getTransferID() {
		return "TransID";
	}

	public InventoryExportReceiptPO buildImport() {
		return null;


	}

	public ResultMessage submitExport(InventoryExportReceiptVO exportReceipt) {
		return SUCCESS;
	}
}