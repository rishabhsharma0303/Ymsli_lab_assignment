package com.assignment1;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			System.out.print(i+"|");
			PrintMultiplicationTable(i);
		}
	

	}
	public static void PrintMultiplicationTable(int n) {
		for(int i=1;i<=9;i++) {
			System.out.print(n*i+" ");
		}
		System.out.println();
	}

}
