package Assignment2.com.assignment.bankingsystem;

public class CurrentAccount extends Account {
int tradeLicenseNumber;
	public CurrentAccount(String name, int accountBalance,int tradeLicenseNumber) {
		super(name, accountBalance);
		// TODO Auto-generated constructor stub
		this.tradeLicenseNumber=tradeLicenseNumber;
	}

public double getBalance() {
		
		return accountBalance;
		
	}
	
	public void withdrawBalance(double money) {
		if(money<=accountBalance) {
		accountBalance=accountBalance-money;
		}else {
			System.out.println("Invalid Operation");
		}
	}
	
}
