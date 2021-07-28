package com.assignment1;

import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the grade for student "+(i+1));
			int var=sc.nextInt();
			if(var<0 || var>100) {
				System.out.println("Invalid try again");
				System.out.println("Enter the grade for student "+(i+1));
				var=sc.nextInt();
				arr[i]=var;
			}else {
				arr[i]=var;
			}
			
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		double avg=(double)sum/n;
		System.out.println(avg);
		

	}

}
