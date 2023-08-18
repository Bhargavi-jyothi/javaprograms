package com.kodnest.ArrayPrograms.level2;

import java.util.Scanner;

public class ReverseAppQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
	   System.out.println();
	   PrintArrayQuestion2 pa=new PrintArrayQuestion2();
	   pa.printArray(arr);
	}

}
