package com.kodnest.ArrayPrograms.level4;

import java.util.Scanner;

public class MergeAppQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("enter the "+arr1.length+" elements into the array including both postive and negative numbers");
        for(int i=0;i<=arr1.length-1;i++) {
        	arr1[i]=scan.nextInt();
        }
        System.out.println("elements in array1 are ...... ");
        for (int i : arr1) {
			System.out.print(i+" ");
		}
        System.out.println();
        System.out.println("enter the  length of  array2 ");
        int arr2[]=new int[scan.nextInt()];
		System.out.println("enter the "+arr2.length+" elements into the array ");
        for(int i=0;i<=arr2.length-1;i++) {
        	arr2[i]=scan.nextInt();
        }
        System.out.println("elements in array2  are......");
        for (int i : arr2) {
			System.out.print(i+" ");
		}
        System.out.println();
        MergeQS2 merge= new MergeQS2();
        int res[]=merge.mergeArray(arr1, arr2);
        System.out.println("elements in merged array are.....");
        for(int i:res) {
        	System.out.print(i+" ");
        }
	}

}
