package ui.specialui.finance.BankAccountManage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import ui.myui.MyJLabel;
import ui.myui.MyJTextField;
import ui.myui.MyTranslucentPanel;
import vo.BankAccountVO;
/**
 * 银行账户信息的修改Panel
 * @author zsq
 *
 */
public class ModifyBankAccount extends MyTranslucentPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private MyJTextField nameField;
	private MyJTextField balanceField;
	
	BankAccountManage bankAccountManage;
	MyJLabel ID ;
	
	static ArrayList<BankAccountVO> accountPool;
	static String accountID = " ";
	
	public ModifyBankAccount() {
		super(660,390-30,550,240);
		this.initComponent();
	}

	private void initComponent() {
		MyJLabel title = new MyJLabel(240,10,150,30,"修改账户",19,true);
		this.add(title);
		
		ID = new MyJLabel(10,40,250,30,"当前账户ID:" + accountID,16,true);
		this.add(ID);
		
		MyJLabel accountName = new MyJLabel(10,80,90,30,"账户名称",16,true);
		this.add(accountName);
		
		MyJLabel balance = new MyJLabel(290,80,120,30,"账户余额",16,true);
		this.add(balance);
		
		 nameField = new MyJTextField(100,80,150,30);
		 nameField.addActionListener(this);
		this.add(nameField);
		
		balanceField = new MyJTextField(380,80,150,30);
		balanceField.setOnlyDouble();
		balanceField.addActionListener(this);
		this.add(balanceField);
	}
	
	public void setUnEditable(){
		nameField.setEditable(false);
		balanceField.setEditable(false);
	}
	
	public String[] getData(){
		String [] data = new String[3];
		data[1] = nameField.getText();
		data[2] = balanceField.getText();
		if(data[1].equals("")||data[2].equals("")){
			return null;
		}
		return data;
	}
	
	public  void setData(String[] data){
	    ID = new MyJLabel(10,40,250,30,"当前账户ID:" + data[0],16,true);
	    this.add(ID);
		nameField.setText(data[1]);
		balanceField.setText(data[2]);
	}
	
	public void refresh() {
		nameField.setText(null);
		balanceField.setText(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nameField)
			balanceField.requestFocus();
		
	}

}
