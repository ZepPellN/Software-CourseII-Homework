package po;

import java.util.ArrayList;

import po.accountpo.AccountPO;

/**
 * 期初建账持久化对象
 * @author zsq
 * @version Oct 25, 2015 
 */
/**
 * 这个系统是可以支持建多套账的，每套帐在新建的时候都要经过期初建账这一环节，可以理解为一套帐的初始化操作。 包括 机构、人员、车辆、库存
 * 银行账户信息（名称，余额）。 期初的信息一旦建立完毕就会单独存储起来，同时将此信息作为系统的启动初始状态。
 * 之后的一切操作将会改变系统里的信息，但不会改变期初信息。期初信息随时可查。
 */
public class OpeningStockPO extends PersistentObject {

	/** serialVersionUID */
	private static final long serialVersionUID = -2898348688803208513L;
	
	private ArrayList<TransferPO> transfers;
	
	private ArrayList<BranchPO> branchs;

	private ArrayList<AccountPO> accounts;

	private ArrayList<FacilityPO> facilities;

	private ArrayList<InventoryPO> inventories;
	
	private ArrayList<BankAccountPO> bankAccounts;

	public OpeningStockPO(String ID,String date, ArrayList<TransferPO> transfers,ArrayList<BranchPO> branchs,
			ArrayList<AccountPO> accounts, ArrayList<FacilityPO> facilities, ArrayList<InventoryPO> inventories,ArrayList<BankAccountPO> bankAccounts) {
		super(ID, date);
		this.transfers=transfers;
		this.branchs=branchs;
		this.accounts = accounts;
		this.facilities = facilities;
		this.inventories = inventories;
		this.bankAccounts = bankAccounts;
	}

	

	public ArrayList<FacilityPO> getFacilities() {
		return facilities;
	}

	public ArrayList<InventoryPO> getInventories() {
		return inventories;
	}

	public ArrayList<AccountPO> getAccounts() {
		return accounts;
	}

	public ArrayList<BankAccountPO> getBankAccounts() {
		return bankAccounts;
	}



	public ArrayList<TransferPO> getTransfers() {
		return transfers;
	}



	public ArrayList<BranchPO> getBranchs() {
		return branchs;
	}

}
