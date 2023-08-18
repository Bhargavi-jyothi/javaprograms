package com.kodnest.ArrayPrograms.level3;

import java.util.Scanner;

public class ArraySearchQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements into an array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key element to search");
		int key=scan.nextInt();
        SearchQs1 search=new SearchQs1();
        boolean res=search.search(arr, key);
        if(res==true) {
        	System.out.println("key is present at index");
        }
        else {
        	System.out.println("key is not present");
        }
	

}
}
