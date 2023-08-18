package com.kodnest.searching.algoriths;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key element to search");
		int key=scan.nextInt();
        BinarySearch binarysearch=new BinarySearch();
        int res=binarysearch.binarySearch(arr, key);
        if(res>0) {
        	System.out.println("key is present at index"+res);
        }
        else {
        	System.out.println("key is not present");
        }
	}

}
