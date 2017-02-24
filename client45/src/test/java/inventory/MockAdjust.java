package inventory;


import po.receiptpo.AdjustReceiptPO;
import vo.InventoryVO;

public class MockAdjust {
	
	public String getAdjustID() {
		
		return "012345678";
	}
	
	
	public AdjustReceiptPO adjust(InventoryVO before,InventoryVO now) {
		return null;
	
	}

}
