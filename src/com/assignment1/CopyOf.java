package com.assignment1;

public class CopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,7,8};
		int narr[]=copyOf(arr);
		for(int temp:narr) {
			System.out.println(temp+" ");
		}

	}
	public static int[] copyOf(int[] array) {
		return array;
	}
}
