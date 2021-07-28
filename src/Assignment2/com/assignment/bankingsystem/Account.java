package Assignment2.com.assignment.bankingsystem;

import java.util.Random;

public class Account {
String accountNumber;
String memberName;
double accountBalance;


public Account(String name, double accountBalance) {
	
	this.memberName = name;
	this.accountBalance = accountBalance;
	Random rand = new Random();
	this.accountNumber=10000 + rand.nextInt(89999) + "";
}


public void deposit(double money) {
	accountBalance+=money;
}

}
