package com.kodnest.ArrayPrograms.level4;

import java.util.Scanner;

public class SumAppQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("enter the "+arr1.length+" elements into the array");
        for(int i=0;i<=arr1.length-1;i++) {
        	arr1[i]=scan.nextInt();
        }
        System.out.println("elements in array1 are.....");
        for (int i : arr1) {
			System.out.print(i+" ");
		}
        System.out.println();
		int arr2[]=new int[arr1.length];
		System.out.println("enter the "+arr1.length+" elements into the array");
        for(int i=0;i<=arr1.length-1;i++) {
        	arr2[i]=scan.nextInt();
        }
        System.out.println("elements in array2 are.....");
        for (int i : arr2) {
			System.out.print(i+" ");
		}
        System.out.println();
        SumQs3 sum=new SumQs3();
        int res[]=sum.sumOfCorrespondingElements(arr1, arr2);
        System.out.println("sum of corresponding elements of an array are.....");
        for(int i:res) {
        	System.out.print(i+" ");
        }
	}
	

}


