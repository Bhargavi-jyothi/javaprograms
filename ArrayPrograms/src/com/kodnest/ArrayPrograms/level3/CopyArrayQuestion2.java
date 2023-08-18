package com.kodnest.ArrayPrograms.level3;

import java.util.Scanner;

public class CopyArrayQuestion2 {

	public static void main(String[] args) {
	
				Scanner scan=new Scanner(System.in);
				System.out.println("enter the length of an array");
				int arr[]=new int[scan.nextInt()];
				System.out.println("Enter "+arr.length+" elements into an array");
				for(int i=0;i<=arr.length-1;i++) {
					arr[i]=scan.nextInt();
				}
				System.out.println("elements of 1st array......");
				for(int i:arr) {
					System.out.print(i+" ");
				}
				System.out.println();
				int res[]=new int[arr.length];
				for(int i=0;i<=arr.length-1;i++) {
					res[i]=arr[i];
				}
				System.out.println("elements of 2nd array......");
				for(int i:res) {
					System.out.print(i+" ");
				}
	}

}
