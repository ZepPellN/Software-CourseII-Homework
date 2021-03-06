package po.receiptpo;

import java.math.BigDecimal;

import state.PayBillItem;
import state.ReceiptType;

/**
 * 成本管理 付款日期、付款金额、付款人、付款账号、 条目（租金（按年收）运费（按次计算）人员工资（按月统计）奖励（一次性）
 * 
 * 备注（租金年份、运单号、标注工资月份） （快递员提成、司机计次、业务员月薪）
 * 
 * @author Ann
 *
 */
public class PaymentBillPO extends DebitAndPayBillPO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 备注（租金年份、运单号、标注工资月份）
	 */
	private String remarks;
	
	private String payerName;
	
	private PayBillItem payBillItem;

	public PaymentBillPO(String ID, String date ,ReceiptType type, BigDecimal money, String payerName, PayBillItem items,
			String accountID, String remarks) {
		super(ID, type, money,accountID);
		this.date = date;
		this.payerName=payerName;
		this.payBillItem=items;
		this.remarks=remarks;
	}
	
	public PaymentBillPO(String ID  ,ReceiptType type, BigDecimal money, String payerName, PayBillItem items,
			String accountID, String remarks) {
		super(ID, type, money,accountID);
		this.payerName=payerName;
		this.payBillItem=items;
		this.remarks=remarks;
	}


	public String getRemarks() {
		return remarks;
	}

	public String getPayerName() {
		return payerName;
	}

	public PayBillItem getPayBillItem() {
		return payBillItem;
	}
	
	


}
