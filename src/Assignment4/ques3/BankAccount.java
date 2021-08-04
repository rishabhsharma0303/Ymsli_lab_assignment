package Assignment4.ques3;

import java.io.Serializable;

public class BankAccount implements Serializable{
	String accountNo;

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BankAccount(String accountNo) {
		this.accountNo = accountNo;
	}
	

}
