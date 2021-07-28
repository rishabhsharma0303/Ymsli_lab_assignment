package Assignment2.com.assignment.bankingsystem;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter USername");
		String userName=sc.nextLine();
		System.out.println("What type of Account you want to open");
		System.out.println(" Press 1 for Saving Account\n Press 2 for Current account ;");
		int flag=sc.nextInt();
		double initDepositByUser;
		
		
		
		if(flag==1) {
			//saving account
			
			SavingAccount account=new SavingAccount(userName, 0, 5, 500);
			//menu
			System.out.println("Enter the money you want to deposits");
			initDepositByUser=sc.nextDouble();
			account.accountBalance=initDepositByUser;
			System.out.println("Do you want to check the balance if yes Press 1 else Press 0");
			int  input=sc.nextInt();
			if(input==1) {
				System.out.println(account.getBalance());
			}else if(input==0) {
				System.out.println("Thanku");
			}else {
				System.out.println("Invalid input");
			}
			
			
			
		}else if(flag==2) {
			//current account
			CurrentAccount account=new CurrentAccount(userName, 0, 20);
			System.out.println("Enter the money you want to deposits");
			initDepositByUser=sc.nextDouble();
			account.accountBalance=initDepositByUser;
			System.out.println("Do you want to check the balance if yes Press Y else Press N");
			String input=sc.nextLine();
			if(input.equals("Y")) {
				System.out.println(account.getBalance());
			}else if(input.equals("N")) {
				System.out.println("Thanku");
			}else {
				System.out.println("Invalid input");
			}
			
		}else if(flag==0) {
			System.exit(0);
		}else {
			System.out.println("Invalid input");
		}
				

	}

}
