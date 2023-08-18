package com.kodnest.ArrayPrograms.level1;

import java.util.Scanner;

public class Question3Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array contents are.......");
		for ( int i : arr) {
			if(i>=0) {
			System.out.print(i+" ");
			
		}
		}

	}

}
