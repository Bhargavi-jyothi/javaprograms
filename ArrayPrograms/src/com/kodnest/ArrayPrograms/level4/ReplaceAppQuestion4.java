package com.kodnest.ArrayPrograms.level4;

import java.util.Scanner;

public class ReplaceAppQuestion4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the "+arr.length+" elements into the array including both postive and negative numbers");
        for(int i=0;i<=arr.length-1;i++) {
        	arr[i]=scan.nextInt();
        }
        System.out.println("elements in array before replacing");
        for (int i : arr) {
			System.out.print(i+" ");
		}
        System.out.println();
        ReplaceQuestion4 replace=new ReplaceQuestion4();
        replace.arrayReplace(arr);
        System.out.println("elements in array after replacing");
        for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
