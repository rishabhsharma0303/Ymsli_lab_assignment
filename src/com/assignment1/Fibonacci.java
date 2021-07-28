package com.assignment1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int sum=a+b;
		int c;
		double avg;
		for(int i=2;i<20;i++) {
			c=a+b;
			sum+=c;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
avg=sum/20.0;
System.out.println(avg);
		
	}

}
