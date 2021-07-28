package Assignment2.com.assignment.bankingsystem;

public class SavingAccount extends Account {
int interst;
double maxWithdrawLimit;
	public SavingAccount(String name, double accountBalance,int interst,double maxWithdrawLimit) {
		super(name, accountBalance);
		// TODO Auto-generated constructor stub
		this.interst=5;
		this.maxWithdrawLimit=maxWithdrawLimit;
	}
	
	public double getBalance() {
		
		return (interst*accountBalance)/100+accountBalance;
		
	}
	
	public void withdrawBalance(int money) {
		if((accountBalance-money)>=maxWithdrawLimit) {
			accountBalance=accountBalance-money;
		}
	}

}
