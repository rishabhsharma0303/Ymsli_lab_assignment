package Assignment4.ques4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionalhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
System.out.println("Please Enter a number or enter -1 if you want to switch");
int n;
Scanner sc= new Scanner(System.in);
try {
	n=sc.nextInt();
	if(n==-1) {
		System.exit(0);
	}
	checkEvenOrOdd(n);
}catch(InputMismatchException exception) {
	System.out.println("you must enter an integer");
}
		}

	}
	public static void checkEvenOrOdd(int n) {
		if(n%2==0) {
			//even
			System.out.println("You have entered an Even Number");
		}else {
			//odd
			System.out.println("You have entered an Odd Number");
		}
	}

}
