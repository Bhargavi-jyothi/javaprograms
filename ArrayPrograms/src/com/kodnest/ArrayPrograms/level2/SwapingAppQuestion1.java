package com.kodnest.ArrayPrograms.level2;

import java.util.Scanner;

public class SwapingAppQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents before swaping are.......");
		for ( int i : arr) {
			System.out.print(i+" ");
	}
	   System.out.println();
	   System.out.println("enetr the indexes which you want to swap");
	   int n1=scan.nextInt();
	   int n2=scan.nextInt();
	   SwapQuestion1 swap=new SwapQuestion1();
	   int res[]=swap.swapArray(arr,n1,n2);
	   System.out.println("array after swapping two indexes is");
	   for ( int i : res) {
			System.out.print(i+" ");
	}
}
}
