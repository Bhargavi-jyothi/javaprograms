package com.kodnest.ArrayPrograms.level4;

import java.util.Scanner;

public class SumArrayAppQuestion1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the "+arr.length+" elements into the array including both postive and negative numbers");
        for(int i=0;i<=arr.length-1;i++) {
        	arr[i]=scan.nextInt();
        }
        System.out.println("elements in array ");
        for (int i : arr) {
			System.out.print(i+" ");
		}
        SumQs1 sum=new SumQs1();
        int res=sum.sumOfElementsOfArray(arr);
        System.out.println();
        System.out.println("sum of elements in array are "+res);
	}

}
